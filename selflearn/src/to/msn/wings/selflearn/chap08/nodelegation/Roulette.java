package to.msn.wings.selflearn.chap08.nodelegation;

import java.util.Random;

public class Roulette extends Random {
private int bound;

  public Roulette(int bound) {
    this.bound = bound;
  }

  @Override
  public int nextInt() {
    return nextInt(this.bound);
  }

  @Override
  public boolean nextBoolean() {
    throw new UnsupportedOperationException();
  }

  @Override
  public long nextLong() {
    throw new UnsupportedOperationException();
  }
}
