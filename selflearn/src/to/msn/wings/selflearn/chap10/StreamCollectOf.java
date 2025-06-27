package to.msn.wings.selflearn.chap10;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamCollectOf {

  public static void main(String[] args) {
    System.out.println(
      Stream.of("バラ", "あさがお", "チューリップ", "さくら")
        .sorted()
        .collect(
          Collector.of(
            ArrayList::new,
            ArrayList::add,
            (list1, list2) -> {
              list1.addAll(list2);
              return list1;
            },
            Collector.Characteristics.IDENTITY_FINISH
          )
        )
    );
  }
}
