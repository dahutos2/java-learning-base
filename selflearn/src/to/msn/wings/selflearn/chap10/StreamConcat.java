package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamConcat {

  public static void main(String[] args) {
    var stream1 = Stream.of("いちじく", "にんじん", "さんしょ");
    var stream2 = Stream.of("しいたけ", "ごぼう", "むくろじゅ");
    Stream.concat(stream1, stream2)
      .forEach(System.out::println);
  }

}
