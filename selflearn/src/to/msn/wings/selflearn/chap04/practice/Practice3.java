package to.msn.wings.selflearn.chap04.practice;

public class Practice3 {

  public static void main(String[] args) {
    var sum = 0;
    for (var i = 100; i <= 200; i++) {
      if (i % 2 == 0) {
        continue;
      }
      sum += i;
    }
    System.out.println("合計値は" + sum);
  }
}
