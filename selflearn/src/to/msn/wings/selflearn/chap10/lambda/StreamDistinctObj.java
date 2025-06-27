package to.msn.wings.selflearn.chap10.lambda;

import java.util.HashSet;
import java.util.stream.Stream;

public class StreamDistinctObj {

  public static void main(String[] args) {
    var set = new HashSet<String>();
    Stream.of(
        new Person("山田", 40),
        new Person("高野", 30),
        new Person("大川", 35),
        new Person("山田", 45)
      )
      .filter(p -> set.add(p.name))
      .forEach(System.out::println);
  }
}
