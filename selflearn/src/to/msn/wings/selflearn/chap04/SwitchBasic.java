package to.msn.wings.selflearn.chap04;

public class SwitchBasic {

  public static void main(String[] args) {
    var rank = "甲";

    switch (rank) {
      case "甲":
        System.out.println("大変良いです。");
        break;

      case "乙":
        System.out.println("良いです。");
        break;

      case "丙":
        System.out.println("がんばりましょう。");
        break;

      default:
        System.out.println("？？？");
        break;
    }
  }
}
