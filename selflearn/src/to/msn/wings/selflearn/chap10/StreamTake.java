package to.msn.wings.selflearn.chap10;

import java.util.stream.IntStream;

public class StreamTake {

  public static void main(String[] args) {
    IntStream.of(-2, -5, 0, 3, -1, 2)
      .takeWhile(i -> i < 0)
      .forEach(System.out::println);
  }
}
