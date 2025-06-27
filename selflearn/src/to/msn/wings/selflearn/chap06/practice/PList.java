package to.msn.wings.selflearn.chap06.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PList {

  public static void main(String[] args) {
    var list = new ArrayList<Integer>(Arrays.asList(10, 15, 30));
    var list2 = new ArrayList<Integer>(Arrays.asList(60 ,90));
    list.remove(0);
    list.set(1, 20);
    list.addAll(2, list2);
    for (var i : list) {
      System.out.println(i);
    }
  }
}
