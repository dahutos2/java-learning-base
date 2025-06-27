package to.msn.wings.selflearn.chap02;

public class ArrayJagged {

  public static void main(String[] args) {
    var list = new int[][] {
      { 1, 2 },
      { 3, 4, 5, 6 },
      { 7, 8, 9 },
    };
    System.out.println(list[1][2]);
    // System.out.println(list.length);
  }
}
