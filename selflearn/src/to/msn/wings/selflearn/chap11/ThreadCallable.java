package to.msn.wings.selflearn.chap11;

import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<Integer> {
  @Override
  public Integer call() throws Exception {
    var rnd = new Random();
    var num = rnd.nextInt(1000);
    Thread.sleep(num);
    return num;
  }
}
