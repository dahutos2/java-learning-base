package to.msn.wings.selflearn.chap05;

public class StrCodePoint {

  public static void main(String[] args) {
    var str = "𠮟る";
    System.out.println(str.codePointCount(0, str.length()));
  }
}
