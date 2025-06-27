package to.msn.wings.selflearn.chap09;

import java.util.List;

public class UnBounded {

  public static void showList(List<?> list) {
    for (var item : list) {
      System.out.println(item);
    }
    //list.add("Hoge");
    //list.add(null);
    // Object obj = list.get(0);
  }
}
