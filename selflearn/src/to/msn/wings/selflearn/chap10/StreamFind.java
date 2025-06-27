package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamFind {

  public static void main(String[] args) {
    var str = Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら", "もも")
        .filter(s -> s.startsWith("さ"))
        .findFirst();
      System.out.println(str.orElse("－"));

//        .parallel()
//        .filter(s -> s.startsWith("さ"))
//        .findAny();
//      System.out.println(str.orElse("－"));
  }
}
