package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegRead {
  private static void match(Pattern ptn, String input) {
    var match = ptn.matcher(input);
    while (match.find()) {
      System.out.println(match.group());
    }
    System.out.println("---");
  }

  public static void main(String[] args) {
    var re1 = Pattern.compile("いろ(?=はに)");
    var re2 = Pattern.compile("いろ(?!はに)");
    var re3 = Pattern.compile("(?<=。)いろ");
    var re4 = Pattern.compile("(?<!。)いろ");
    var msg1 = "いろはにほへと";
    var msg2 = "いろものですね。いろいろと";
    match(re1, msg1);
    match(re1, msg2);
    match(re2, msg1);
    match(re2, msg2);
    match(re3, msg1);
    match(re3, msg2);
    match(re4, msg1);
    match(re4, msg2);
  }
}
