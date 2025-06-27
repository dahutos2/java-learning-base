package to.msn.wings.selflearn.chap08.delegation;

import java.util.Random;

public class Roulette {
  private int bound;
  private Random random = new Random();

  public Roulette(int bound) {
    this.bound = bound;
  }

  public int nextInt() {
    return this.random.nextInt(this.bound);
  }
}
