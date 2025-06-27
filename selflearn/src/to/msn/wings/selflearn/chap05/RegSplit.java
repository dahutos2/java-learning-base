package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegSplit {

  public static void main(String[] args) {
    var str = "にわに3わうらにわに51わにわとりがいる";
    var re = Pattern.compile("\\d{1,}わ");
    var result = re.split(str);
    System.out.println(String.join(" ", result));
  }
}
