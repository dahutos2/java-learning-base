package to.msn.wings.selflearn.chap10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGrouping {

  public static void main(String[] args) {
    System.out.println(
        Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら")
          .sorted()
          .collect(
            Collectors.groupingBy(str -> str.length()
          ))
      );
  }
}
