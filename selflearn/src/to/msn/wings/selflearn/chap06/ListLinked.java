package to.msn.wings.selflearn.chap06;

import java.util.Arrays;
import java.util.LinkedList;

public class ListLinked {

  public static void main(String[] args) {
    var list = new LinkedList<String>(Arrays.asList("うさぎ", "たつ", "へび"));
    System.out.println(list);

    list.addFirst("とら");
    list.addLast("うま");
    System.out.println(list);
    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    System.out.println(list.removeFirst());
    System.out.println(list.removeLast());
    System.out.println(list);
  }
}
