package to.msn.wings.selflearn.chap04;

public class IfOmit2 {

  public static void main(String[] args) {
    var i = 1;
    var j = 0;
    if (i == 1)
      if (j == 1)
        System.out.println("変数i、jは1です。");
    else
      System.out.println("変数iは1ではありません。");
  }
}
