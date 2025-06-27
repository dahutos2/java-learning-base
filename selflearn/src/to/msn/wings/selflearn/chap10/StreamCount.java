package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamCount {

  public static void main(String[] args) {
    System.out.println(
        Stream.of("バラ", "あさがお", "チューリップ", "さくら")
          .filter(s -> s.length() > 3)
          .count()
    );
  }
}
