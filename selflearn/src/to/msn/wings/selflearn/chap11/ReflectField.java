package to.msn.wings.selflearn.chap11;

import java.lang.reflect.InvocationTargetException;

import to.msn.wings.selflearn.chap09.Person;

public class ReflectField {

  public static void main(String[] args) {
    try {
      var clazz = Person.class;
      var con = clazz.getConstructor(String.class, String.class);
      var p = con.newInstance("太郎", "山田");
      var last = clazz.getDeclaredField("lastName");
      last.setAccessible(true);
      last.set(p, "鈴木");
      System.out.println(last.get(p));
    } catch (NoSuchMethodException | SecurityException |
        InstantiationException | IllegalAccessException
        | IllegalArgumentException | InvocationTargetException |
        NoSuchFieldException e) {
      e.printStackTrace();
    }
  }
}
