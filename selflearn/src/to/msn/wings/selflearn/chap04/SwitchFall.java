package to.msn.wings.selflearn.chap04;

public class SwitchFall {

  public static void main(String[] args) {
    var drink = "ビール";
    switch (drink) {
      case "日本酒":
      case "ビール":
      case "ワイン":
        System.out.println("醸造酒です。");
        break;
      case "ブランデー":
      case "ウイスキー":
        System.out.println("蒸留酒です。");
        break;
    }
  }
}
