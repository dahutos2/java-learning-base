package to.msn.wings.selflearn.chap07.optional2;

import java.util.Optional;

public class OptionalExample {

  public static void main(String[] args) {
    var opt1 = Optional.of("サンプル1");
    var opt2 = Optional.ofNullable(null);
    var opt3 = Optional.empty();

    System.out.println(opt1.isPresent());

    opt1.ifPresent(value -> {
      System.out.println(value);
    });

    System.out.println(opt2.orElse("null値です"));

    System.out.println(opt3.orElseGet(() -> {
      return "null値です";
    }));
  }
}
