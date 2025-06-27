package to.msn.wings.selflearn.chap03;

import java.util.Arrays;

public class CompareArrayMethod {

  public static void main(String[] args) {
    var data1 = new int[] {1, 3};
    var data2 = new int[] {1, 2, 3};
    var data3 = new int[] {1, 2, 3};
    var data4 = new int[] {1, 3, 1};
    System.out.println(Arrays.compare(data1, data2));
    System.out.println(Arrays.compare(data3, data4));
    System.out.println(Arrays.compare(data2, data3));
  }
}
