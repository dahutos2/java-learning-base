package to.msn.wings.selflearn.chap09;

import java.util.regex.Pattern;

public class EnumBit2 {

  public static void main(String[] args) {
    var flags = Pattern.CASE_INSENSITIVE | Pattern.MULTILINE;
    // var flags = Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.COMMENTS;
    // var flags = Pattern.CASE_INSENSITIVE;
    if ((flags & (Pattern.CASE_INSENSITIVE | Pattern.MULTILINE)) == (Pattern.CASE_INSENSITIVE | Pattern.MULTILINE)) {
      System.out.println("CASE_INSENTIVE／MULTILINEを含んでいる。");
    }
    if ((flags | (Pattern.CASE_INSENSITIVE | Pattern.MULTILINE)) == (Pattern.CASE_INSENSITIVE | Pattern.MULTILINE)) {
      System.out.println("CASE_INSENTIVE／MULTILINEだけを含んでいる。");
    }
  }

}
