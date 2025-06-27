package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegAfter {

  public static void main(String[] args) {
    var str = "<p>サポートサイト<a href=\"https://www.wings.msn.to/\">https://www.wings.msn.to/</a></p>";
    var ptn = Pattern.compile("<a href=\"(.+?)\">\\1</a>");
    // var ptn = Pattern.compile("<a href=\"(?<link>.+?)\">\\k<link></a>");
    var match = ptn.matcher(str);
    if (match.find()) {
      System.out.println(match.group());
    }
  }
}
