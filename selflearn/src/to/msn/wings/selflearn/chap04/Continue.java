package to.msn.wings.selflearn.chap04;

public class Continue {

  public static void main(String[] args) {
    var sum = 0;

    for (var i = 0; i <= 100; i++) {
      if (i % 2 != 0) {
        continue;
      }
      sum += i;
    }

    System.out.println("合計値は" + sum + "です。");
  }
}
