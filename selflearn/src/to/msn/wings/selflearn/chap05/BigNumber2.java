package to.msn.wings.selflearn.chap05;

import java.math.BigInteger;

public class BigNumber2 {

  public static void main(String[] args) {
    var result = BigInteger.valueOf(1);
    for (var i = 1; i < 26; i++) {
      result = result.multiply(BigInteger.valueOf(i));
      System.out.println(result);
    }
  }
}
