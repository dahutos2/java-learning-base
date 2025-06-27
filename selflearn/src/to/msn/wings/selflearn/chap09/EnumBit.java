package to.msn.wings.selflearn.chap09;

import java.util.regex.Pattern;

public class EnumBit {

  public static void main(String[] args) {
    var flags = Pattern.CASE_INSENSITIVE | Pattern.MULTILINE;
    if ((flags & Pattern.COMMENTS) != 0) {
      System.out.println("COMMENTSは有効です。");
    }
  }
}
