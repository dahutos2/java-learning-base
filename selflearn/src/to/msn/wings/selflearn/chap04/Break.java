package to.msn.wings.selflearn.chap04;

public class Break {

  public static void main(String[] args) {
    int i;
    int sum = 0;

    for (i = 1; i <= 100; i++) {
      sum += i;
      if (sum > 1000) {
        break;
      }
    }

    System.out.println("合計が1000を超えるのは、1～" + i + "を加算したときです。");
  }
}
