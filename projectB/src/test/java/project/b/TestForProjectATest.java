
package project.b;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import project.a.SourceInProjectA;
import project.a.TestFixturesInProjectA;

class TestForProjectATest {
  @Test
  void testCallMeInSource() {
    assertTrue(SourceInProjectA.callMeInSource());
  }

  @Test
  void testCallMeInTestFixutres() {
    assertTrue(TestFixturesInProjectA.callMeInTestFixtures());
  }
}
