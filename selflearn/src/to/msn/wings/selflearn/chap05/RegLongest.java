package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegLongest {

  public static void main(String[] args) {
    var tags = "<p><strong>WINGS</strong>サイト<a href='index.html'><img src='wings.jpg' /></a></p>";
    // var ptn = Pattern.compile("<.+>");
    var ptn = Pattern.compile("<.+?>");
    var match = ptn.matcher(tags);
    while (match.find()) {
      System.out.println(match.group());
    }
  }
}
