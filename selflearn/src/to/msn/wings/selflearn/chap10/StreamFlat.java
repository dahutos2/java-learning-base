package to.msn.wings.selflearn.chap10;

import java.util.Arrays;

public class StreamFlat {

  public static void main(String[] args) {
    var list = new String[][] {
      { "あいう", "かきく", "さしす" },
      { "たちつ", "なにぬ" },
      { "はひふ", "まみむ" }
    };
    Arrays.stream(list)
      .flatMap(v -> Arrays.stream(v))
      .forEach(System.out::println);

//    Arrays.stream(list)
//    .flatMap(v -> Arrays.stream(v).map(str -> str.substring(0, 1)))
//    .forEach(System.out::println);
    }
}
