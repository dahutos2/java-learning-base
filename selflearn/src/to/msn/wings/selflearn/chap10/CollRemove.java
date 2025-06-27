package to.msn.wings.selflearn.chap10;

import java.util.ArrayList;
import java.util.Arrays;

public class CollRemove {

  public static void main(String[] args) {
    var list = new ArrayList<String>(
      Arrays.asList("バラ", "チューリップ", "あさがお", "ヒヤシンス"));
    list.removeIf(v -> v.length() > 4);
    System.out.println(list);
  }
}
