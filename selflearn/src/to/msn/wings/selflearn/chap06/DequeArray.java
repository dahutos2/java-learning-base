package to.msn.wings.selflearn.chap06;

import java.util.ArrayDeque;

public class DequeArray {

  public static void main(String[] args) {
    var data = new ArrayDeque<Integer>();
    data.addLast(10);
    data.addLast(15);
    data.addLast(30);

    System.out.println(data);
    System.out.println(data.removeLast());
    System.out.println(data);

    var data2 = new ArrayDeque<Integer>();
    data2.addLast(10);
    data2.addLast(15);
    data2.addLast(30);

    System.out.println(data2);
    System.out.println(data2.removeFirst());
    System.out.println(data2);
  }
}
