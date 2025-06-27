package to.msn.wings.selflearn.chap10;

import java.util.stream.IntStream;

public class StreamCast {

  public static void main(String[] args) {
    IntStream.range(1, 5)
      .asDoubleStream()
      .forEach(System.out::println);
  }
}
