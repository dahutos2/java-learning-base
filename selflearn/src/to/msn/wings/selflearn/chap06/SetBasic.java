package to.msn.wings.selflearn.chap06;

import java.util.Arrays;
import java.util.HashSet;

public class SetBasic {

  public static void main(String[] args) {
    var hs = new HashSet<Integer>(Arrays.asList(1, 20, 30, 10, 30, 60, 15));
    var hs2 = new HashSet<Integer>(Arrays.asList(10 ,20 ,99));

    System.out.println(hs);
    System.out.println(hs.size());
    System.out.println(hs.isEmpty());
    System.out.println(hs.contains(1));
    System.out.println(hs.containsAll(hs2));
    System.out.println(hs.remove(1));
    System.out.println(hs);

    hs.addAll(hs2);
    System.out.println(hs);

    hs.retainAll(hs2);
    System.out.println(hs);

    var hs3 = new HashSet<Integer>(Arrays.asList(1, 10 , 20));
    hs.removeAll(hs3);
    System.out.println(hs);
  }
}
