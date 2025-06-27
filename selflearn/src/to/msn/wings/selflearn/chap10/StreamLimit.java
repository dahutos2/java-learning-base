package to.msn.wings.selflearn.chap10;

import java.util.stream.IntStream;

public class StreamLimit {

  public static void main(String[] args) {
    IntStream.range(1, 20)
      .skip(4)
      .limit(10)
      .forEach(System.out::println);
  }
}
