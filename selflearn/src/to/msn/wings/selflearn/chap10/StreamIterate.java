package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamIterate {

  public static void main(String[] args) {
    var stream = Stream.iterate(1, (num) -> {
      return num * 2;
    });
    stream.limit(10).forEach(System.out::println);
  }
}
