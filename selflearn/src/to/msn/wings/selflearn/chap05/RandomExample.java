package to.msn.wings.selflearn.chap05;

import java.util.Random;

public class RandomExample {

  public static void main(String[] args) {
    var rnd = new Random();
    System.out.println(rnd.nextBoolean());
    System.out.println(rnd.nextFloat());
    System.out.println(rnd.nextDouble());
    System.out.println(rnd.nextInt(400) + 100);
    System.out.println(rnd.nextLong());

    var data = new byte[5];
    rnd.nextBytes(data);
    for (var b : data) {
      System.out.print(b + " ");
    }
  }
}
