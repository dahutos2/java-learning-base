package to.msn.wings.selflearn.chap05;

public class BigNumber {

  public static void main(String[] args) {
    long result = 1;
    for (var i = 1; i < 26; i++) {
      result *= i;
      System.out.println(result);
    }
  }
}
