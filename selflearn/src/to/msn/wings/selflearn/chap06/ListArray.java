package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {

  public static void main(String[] args) {
    var list = new ArrayList<Integer>(Arrays.asList(10, 15, 30, 60));
    var list2 = new ArrayList<Integer>(Arrays.asList(1, 5, 3, 6));
    var list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

    for (var i : list) {
      System.out.println(i / 5);
    }

    System.out.println(list.size());
    System.out.println(list.get(0));
    System.out.println(list.contains(30));
    System.out.println(list.indexOf(30));
    System.out.println(list.lastIndexOf(30));
    System.out.println(list.isEmpty());
    System.out.println(list.remove(0));
    System.out.println(list);

    list.addAll(list2);
    System.out.println(list);

    list.removeAll(list3);
    System.out.println(list);

    list.set(0, 100);
    var data = list.toArray();
    System.out.println(Arrays.toString(data));
  }
}
