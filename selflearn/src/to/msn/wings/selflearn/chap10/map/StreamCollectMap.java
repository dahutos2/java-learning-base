package to.msn.wings.selflearn.chap10.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectMap {

  public static void main(String[] args) {
    System.out.println(
        Stream.of(
          new Person("山田太郎", "tyamada@example.com"),
          new Person("鈴木花子", "hsuzuki@example.com"),
          new Person("井上三郎", "sinoue@example.com"),
          new Person("佐藤久美", "ksatou2@example.com"),
          new Person("山田太郎", "yamataro@example.com")
        ).collect(Collectors.toMap(
          Person::getName,
          Person::getEmail,
          (s, a) -> s + "/" + a
          // (s, a) ->  a
        ))
      );
  }
}
