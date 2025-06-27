package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamSort {

  public static void main(String[] args) {
    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
    .sorted()
    .forEach(System.out::println);

//    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
//    .sorted((str1, str2) -> str1.length() - str2.length())
//    .forEach(System.out::println);

//    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
//    .sorted(Comparator.reverseOrder())
//    .forEach(System.out::println);
  }
}
