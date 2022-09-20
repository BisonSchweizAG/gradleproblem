# Problem with Gradle-Build, if testImplementation testFixtures and implementation is used
As long as the line `testImplementation testFixtures(project(':projectA'))` exists in `build.gradle` the build in command line complete successfully, but Eclipse does NOT compile.
If the above line will be removed, Eclipse compiles, but the build in command line fails.

This behaviour can be fixed by adding below lines into the `subprojects`-block of `build.gradle`:
```
  apply {
    ...
    plugin 'eclipse-wtp'
  }

  configurations {
    eclipseExtraClasspath.extendsFrom testImplementation
  }
  
  eclipse {
    classpath {
      plusConfigurations += [ configurations.eclipseExtraClasspath ]
    }
  }
```
But shouldn't exactly this be done by the `java-test-fixture` or the `Buildship` plugin?
