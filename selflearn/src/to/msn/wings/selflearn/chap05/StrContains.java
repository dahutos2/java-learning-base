package to.msn.wings.selflearn.chap05;

public class StrContains {

  public static void main(String[] args) {
    var str = "WINGSプロジェクト";

    System.out.println(str.contains("プロ"));
    System.out.println(str.startsWith("WINGS"));
    System.out.println(str.startsWith("WINGS", 3));
    System.out.println(str.endsWith("WINGS"));

    System.out.println(str.indexOf("プロ") > 0);
    System.out.println(str.indexOf("WINGS") == 0);
  }
}
