package to.msn.wings.selflearn.chap11;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ReflectInstance {

  public static void main(String[] args) {
    try {
      var clazz = File.class;
      var c = clazz.getConstructor(String.class);
      var fl = c.newInstance("c:/data/data.txt");
      System.out.println(fl);

      var list = (File[]) Array.newInstance(File.class, 2);
      Array.set(list, 0, fl);
      System.out.println(Arrays.toString(list));
    } catch (InstantiationException | IllegalAccessException |
        IllegalArgumentException | InvocationTargetException
        | NoSuchMethodException | SecurityException e) {
      e.printStackTrace();
    }
  }
}
