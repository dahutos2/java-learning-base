package to.msn.wings.selflearn.chap08.nodelegation;

import java.util.Random;

public class RouletteClient {

  public static void main(String[] args) {
    Random rou = new Roulette(10);
    System.out.println(rou.nextBoolean());
  }
}
