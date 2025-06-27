package to.msn.wings.selflearn.chap05;

import java.util.Arrays;

public class ArrayDeep {

  public static void main(String[] args) {
    var list1 = new StringBuilder[] {
        new StringBuilder("ドレミファソ"),
        new StringBuilder("CDEFG"),
        new StringBuilder("ハニホヘト")
      };

    var list2 = new StringBuilder[list1.length];
    for (var i = 0; i < list1.length; i++) {
      list2[i] = new StringBuilder(list1[i].toString());
    }

    list1[2].append("イロハ");
    System.out.println(Arrays.toString(list1));
    System.out.println(Arrays.toString(list2));
  }
}
