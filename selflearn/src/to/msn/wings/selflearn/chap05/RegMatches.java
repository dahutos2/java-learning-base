package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegMatches {

  public static void main(String[] args) {
    var tel = new String[] { "080-0000-0000", "084-000-0000", "184-0000" };
    var rx = "\\d{2,4}-\\d{2,4}-\\d{4}";
    for (var t : tel) {
      System.out.println(Pattern.matches(rx, t) ? t : "アンマッチ");
      // System.out.println(t.matches(rx) ? t : "アンマッチ");
    }
  }
}
