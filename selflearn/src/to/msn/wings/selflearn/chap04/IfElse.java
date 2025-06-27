package to.msn.wings.selflearn.chap04;

public class IfElse {

  public static void main(String[] args) {
    var i = 100;
    if (i > 50) {
      System.out.println("変数iは50より大きいです。");
    } else if (i > 30) {
      System.out.println("変数iは30より大きく、50以下です。");
    } else {
      System.out.println("変数iは30以下です。");
    }
  }
}
