package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamReduce3 {

  public static void main(String[] args) {
    System.out.println(
      Stream.of("153", "211", "112", "350", "418", "208")
        .parallel()
        .reduce(0,
          (result, value) -> {
            return result + Integer.parseInt(value);
          },
          (result1, result2) -> {
            return result1 + result2;
          }
      )
    );
  }
}
