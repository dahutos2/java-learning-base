package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamTrans {

  public static void main(String[] args) {
    var list = Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら")
        .filter(s -> s.startsWith("さ"))
        .toArray();
    System.out.println(list[0]);
  }
}
