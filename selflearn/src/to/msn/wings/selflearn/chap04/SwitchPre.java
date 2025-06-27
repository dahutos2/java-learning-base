package to.msn.wings.selflearn.chap04;

public class SwitchPre {

  public static void main(String[] args) {
    var rank = "甲";

    if (rank.equals("甲")) {
      System.out.println("大変良いです。");
    } else if (rank.equals("乙")) {
      System.out.println("良いです。");
    } else if (rank.equals("丙")) {
      System.out.println("がんばりましょう。");
    } else {
      System.out.println("？？？");
    }
  }
}
