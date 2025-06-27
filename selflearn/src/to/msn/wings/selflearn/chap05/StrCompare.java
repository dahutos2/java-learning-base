package to.msn.wings.selflearn.chap05;

public class StrCompare {

  public static void main(String[] args) {
    var str = "def";
    System.out.println(str.compareTo("abc"));
    System.out.println(str.compareTo("def"));
    System.out.println(str.compareTo("xyz"));
    System.out.println(str.compareToIgnoreCase("DEF"));
  }
}
