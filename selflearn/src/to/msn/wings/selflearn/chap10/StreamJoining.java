package to.msn.wings.selflearn.chap10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoining {

  public static void main(String[] args) {
    System.out.println(
        Stream.of("バラ", "あさがお", "チューリップ", "さくら")
          .sorted()
          .collect(Collectors.joining(",", "<", ">"))
      );
  }
}
