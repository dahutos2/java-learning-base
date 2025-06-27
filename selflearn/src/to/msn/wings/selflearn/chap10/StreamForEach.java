package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamForEach {

  public static void main(String[] args) {
    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
//    .parallel()
//    .forEachOrdered(v -> System.out.println(v));

    .forEach(v -> System.out.println(v));
  }
}
