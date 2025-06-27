package to.msn.wings.selflearn.chap11;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectInvoke {

  public static void main(String[] args) {
    try {
      var clazz = File.class;
      var f1 = clazz.getConstructor(String.class).newInstance("c:/data/data.txt");
      var f2 = clazz.getConstructor(String.class).newInstance("c:/data/sample.txt");
      Method m = clazz.getMethod("renameTo", File.class);
      System.out.println(m.invoke(f1, f2));
    } catch (NoSuchMethodException | SecurityException |
        InstantiationException | IllegalAccessException
        | IllegalArgumentException | InvocationTargetException e) {
      e.printStackTrace();
    }
  }
}
