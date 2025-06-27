package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamBuild {

  public static void main(String[] args) {
    var builder = Stream.builder()
        .add("いちじく")
        .add("にんじん")
        .add("さんしょ");
      builder.build().forEach(System.out::println);
  }
}
