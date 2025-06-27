package to.msn.wings.selflearn.chap05;

public class StrSubstring2 {

  public static void main(String[] args) {
    var mail = "yamada@example.com";
    System.out.println(mail.substring(mail.lastIndexOf("@") + 1));
    System.out.println(mail.charAt(0));

//    for (var i = 0; i < mail.length(); i++) {
//      System.out.println(mail.charAt(i));
//    }
  }
}
