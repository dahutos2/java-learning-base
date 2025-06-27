package to.msn.wings.selflearn.chap10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTrans2 {

  public static void main(String[] args) {
    var list = Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら")
        .filter(s -> s.startsWith("さ"))
        .collect(Collectors.toList());
    System.out.println(list);
  }
}
