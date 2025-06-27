package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.util.Locale;

public class StrFormat {

  public static void main(String[] args) {
    System.out.println(String.format(
      "%sは%s、%d歳です。", "サクラ", "女の子", 1));

    System.out.println(String.format(
      "名前は%1$s、%3$d歳です。%1$sは、元気です。", "サクラ", "女の子", 1));

    System.out.println(String.format("%.2sです。", "サクラ"));

    System.out.println(String.format("%5sです。", "サクラ"));

    System.out.println(String.format("%-5sです。", "サクラ"));

    System.out.println(String.format("10進数 %08d", 12345));

    System.out.println(String.format("16進数 %#x", 10));

    System.out.println(String.format("小数点数 %.2f", 123.456));

    System.out.println(String.format("指数／小文字 %.2e", 123.456));

    System.out.println(String.format("指数／大文字 %.2E", 123.456));

    var d = LocalDateTime.now();
    System.out.println(String.format("%tF", d));

    System.out.println(String.format("%tr", d));

    System.out.println(String.format("%1$tY年 %1$tm月 %1$td日", d));

    System.out.println(String.format(Locale.GERMAN, "%f", 1234.567));

    System.out.println(String.format(Locale.GERMAN, "%tr", d));

    System.out.printf("%.2sです。\n", "サクラ");
  }
}
