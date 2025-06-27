package to.msn.wings.selflearn.chap09;

public class EnumMethod {

  public static void main(String[] args) {
    for (var se : Season.values()) {
      System.out.println(se.ordinal() + ":" + se.toString());
    }
    var s = Season.valueOf("SPRING");
    System.out.println(s instanceof Season);
  }
}
