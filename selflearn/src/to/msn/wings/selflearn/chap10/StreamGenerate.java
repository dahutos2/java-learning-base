package to.msn.wings.selflearn.chap10;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerate {

  public static void main(String[] args) {
    var stream = Stream.generate(() -> {
      var r = new Random();
      return r.nextInt(100);
    });
    stream.limit(10).forEach(System.out::println);
  }
}
