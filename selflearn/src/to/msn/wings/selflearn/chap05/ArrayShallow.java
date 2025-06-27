package to.msn.wings.selflearn.chap05;

import java.util.Arrays;

public class ArrayShallow {

  public static void main(String[] args) {
    var list1 = new StringBuilder[]{
      new StringBuilder("ドレミファソ"),
      new StringBuilder("CDEFG"),
      new StringBuilder("ハニホヘト")
    };
    var list2 = Arrays.copyOf(list1, list1.length);

    list1[2].append("イロハ");
    System.out.println(Arrays.toString(list1));
    System.out.println(Arrays.toString(list2));
  }
}
