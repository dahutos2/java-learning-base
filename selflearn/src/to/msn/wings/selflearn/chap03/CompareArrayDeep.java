package to.msn.wings.selflearn.chap03;

import java.util.Arrays;

public class CompareArrayDeep {

  public static void main(String[] args) {
    var data1 = new int[][] {
      { 1, 2, 3 },
      { 4, 5, 6 },
      { 7, 8, 9 },
    };
    var data2 = new int[][] {
      { 1, 2, 3 },
      { 4, 5, 6 },
      { 7, 8, 9 },
    };
    System.out.println(Arrays.equals(data1, data2));
    System.out.println(Arrays.deepEquals(data1, data2));
  }
}
