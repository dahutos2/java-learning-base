package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegMatcherNamed {

  public static void main(String[] args) {
    var msg = "会社の電話は0123-99-0000です。自宅は000-123-4567だよ。";
    var ptn = Pattern.compile("(?<area>\\d{2,4})-(?<city>\\d{2,4})-(?<local>\\d{4})");
    var match = ptn.matcher(msg);
    while (match.find()) {
      System.out.println("開始位置：" + match.start());
      System.out.println("終了位置：" + match.end());
      System.out.println("マッチング文字列：" + match.group());
      System.out.println("市外局番：" + match.group("area"));
      System.out.println("市内局番：" + match.group("city"));
      System.out.println("加入者番号：" + match.group("local"));
      System.out.println("-----");
    }
  }
}
