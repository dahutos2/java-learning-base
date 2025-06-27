package to.msn.wings.selflearn.chap10;

import java.util.stream.IntStream;

public class StreamMatch {

  public static void main(String[] args) {
    System.out.println(
        IntStream.of(1, 10, 5, -5, 12)
          .allMatch(v -> v >= 0)
          // .anyMatch(v -> v >= 0)
      );
  }
}
