package to.msn.wings.selflearn.chap07.constructor.init;

import java.time.LocalDate;

public class InitBasic {

  public static void main(String[] args) {
    var p = new Person("太郎", "山田", LocalDate.of(1985, 1, 10));
    System.out.println(p.name);
    System.out.println(p.age + "歳");
    System.out.println(p.updated);

    var p2 = new Person("鈴木 花子", 20);
    System.out.println(p2.name);
    System.out.println(p2.age + "歳");
    System.out.println(p2.updated);
  }
}
