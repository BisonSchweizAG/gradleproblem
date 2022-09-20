
package project.b;

import project.a.SourceInProjectA;

public class SourceInProjectB {
  public boolean callMethodFromProjectA() {
    return SourceInProjectA.callMeInSource();
  }
}
