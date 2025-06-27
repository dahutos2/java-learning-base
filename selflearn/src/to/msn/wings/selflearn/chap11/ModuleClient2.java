package to.msn.wings.selflearn.chap11;

import java.lang.reflect.InvocationTargetException;

import mylib.lib.MainLib;

public class ModuleClient2 {

  public static void main(String[] args) {
    try {
      var clazz = MainLib.class;
      var con = clazz.getConstructor();
      var m = con.newInstance();
      var name = clazz.getDeclaredField("name");
      name.setAccessible(true);
      System.out.println(name.get(m));

//      var memo = clazz.getDeclaredField("memo");
//      memo.setAccessible(true);
//      System.out.println(memo.get(m));
    } catch (InstantiationException | IllegalAccessException |
        IllegalArgumentException | InvocationTargetException
        | NoSuchMethodException | SecurityException | NoSuchFieldException e) {
      e.printStackTrace();
    }
  }
}
