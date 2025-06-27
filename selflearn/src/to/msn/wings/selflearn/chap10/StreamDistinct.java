package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamDistinct {

  public static void main(String[] args) {
    Stream.of("あか", "さかな", "あか", "こだま", "こだま")
      .distinct()
      .forEach(System.out::println);
  }
}
