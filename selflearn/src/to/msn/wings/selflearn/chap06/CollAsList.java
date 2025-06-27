package to.msn.wings.selflearn.chap06;

import java.util.Arrays;

public class CollAsList {

  public static void main(String[] args) {
    var data = new String[] { "バラ", "ひまわり", "あさがお"};
    var list = Arrays.asList(data);
    list.set(0, "チューリップ");
    System.out.println(list);
    System.out.println(Arrays.toString(data));

    list.add("さくら");
    list.remove(0);
  }
}
