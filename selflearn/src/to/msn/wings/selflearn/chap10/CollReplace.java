package to.msn.wings.selflearn.chap10;

import java.util.ArrayList;
import java.util.Arrays;

public class CollReplace {

  public static void main(String[] args) {
    var list = new ArrayList<String>(
        Arrays.asList("バラ", "チューリップ", "あさがお"));
    list.replaceAll(v -> {
      if (v.length() < 3) {
        return v;
      } else {
        return v.substring(0, 3);
      }
    });
    System.out.println(list);
  }
}
