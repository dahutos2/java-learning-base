package to.msn.wings.selflearn.chap05.practice;

public class PReplace {

  public static void main(String[] args) {
    var str = "お問い合わせはsupport@example.comまで";
    System.out.println(str.replaceAll(
        "[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(?:\\.[a-z0-9-]+)*",
        "<a href=\"mailto:$0\">$0</a>"));
  }
}
