package to.msn.wings.selflearn.chap11;

import java.io.File;

public class ReflectMethods {

  public static void main(String[] args) {
    var str = File.class;
    for (var m : str.getMethods()) {
      System.out.println(m.getName());
    }
  }
}
