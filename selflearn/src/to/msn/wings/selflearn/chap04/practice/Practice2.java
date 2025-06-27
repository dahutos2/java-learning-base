package to.msn.wings.selflearn.chap04.practice;

public class Practice2 {

  public static void main(String[] args) {
    var i = 1;
    var sum = 0;

    while (i <= 100) {
      sum += i;
      if (sum > 1000) {
        break;
      }
      i++;
    }

    System.out.println("合計が1000を超えるのは、1～" + i + "を加算したときです。");
  }
}
