package to.msn.wings.selflearn.chap09;

import java.util.List;

public class GenericBounded {
  //public void show(List<Parent> list) {
  public void show(List<? extends Parent> list) {
    for (var p : list) {
      System.out.println(p.getName());
    }
  }
}
