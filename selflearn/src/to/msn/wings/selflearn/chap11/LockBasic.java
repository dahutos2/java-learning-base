package to.msn.wings.selflearn.chap11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockBasic {
  private int value = 0;
  private final Lock lock = new ReentrantLock();

  public static void main(String[] args) {
    final int TASK_NUM = 100000;
    var th = new Thread[TASK_NUM];
    var tb = new LockBasic();
    for (var i = 0; i < TASK_NUM; i++) {
      th[i] = new Thread(() -> {
        tb.increment();
      });
      th[i].start();
    }
    for (var i = 0; i < TASK_NUM; i++) {
      try {
        th[i].join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println(tb.value);
  }

  void increment() {
    lock.lock();
    try {
      this.value++;
    } finally {
      lock.unlock();
    }
  }
}
