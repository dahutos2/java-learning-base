package to.msn.wings.selflearn.chap10;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamBasic {

  public static void main(String[] args) {
    var list = new ArrayList<String>(Arrays.asList("ant", "elephant", "hamster"));

    list.
      stream().
      filter(s -> s.length() > 3).
      map(String::toUpperCase).
      forEach(System.out::println);
  }
}
