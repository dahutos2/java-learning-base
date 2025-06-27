package to.msn.wings.selflearn.chap10;

import java.util.stream.IntStream;

public class StreamSum {

  public static void main(String[] args) {
    var list = new int[] { 5, 1, 10, -3 };
    System.out.println(IntStream.of(list).sum());
    System.out.println(IntStream.of(list).average().orElse(0));
  }
}
