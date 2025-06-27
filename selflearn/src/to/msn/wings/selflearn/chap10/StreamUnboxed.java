package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamUnboxed {

  public static void main(String[] args) {
    Stream.of(1, 2, 3, 4)
      .mapToInt(i -> i)
      .forEach(System.out::println);
    }
}
