package to.msn.wings.selflearn.chap11;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicBasic {
  private AtomicInteger value = new AtomicInteger();

  public static void main(String[] args) {
    final int TASK_NUM = 100000;
    var th = new Thread[TASK_NUM];
    var tb = new AtomicBasic();
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
    value.getAndIncrement();
  }
}
