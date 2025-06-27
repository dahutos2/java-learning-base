package to.msn.wings.selflearn.chap10;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMin {

  public static void main(String[] args) {
    var str = Stream.of("めばる", "さんま", "ひらめ", "いわし", "ほっけ")
        .min(Comparator.naturalOrder());
      System.out.println(str.orElse(""));
  }
}
