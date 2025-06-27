package to.msn.wings.selflearn.chap09.compare;

import java.util.Arrays;

public class CompareBasic {

  public static void main(String[] args) {
    var data = new Person[] {
        new Person("タロウ", "マツダ"),
        new Person("リコ", "モリヤマ"),
        new Person("コウスケ", "モリタ"),
        new Person("マリコ", "モリヤ"),
        new Person("ソウシ", "ムラカミ"),
        new Person("エミ", "ヤマダ"),
      };
      Arrays.sort(data);
      System.out.println(Arrays.toString(data));
  }
}
