package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamFilter {

  public static void main(String[] args) {
    Stream.of(
      "https://www.shoeisha.co.jp/",
      "SEshop",
      "https://codezine.jp/",
      "https://wings.msn.to/",
      "WingsProject"
    )
      .filter(s -> s.startsWith("https://"))
      .forEach(System.out::println);
  }
}
