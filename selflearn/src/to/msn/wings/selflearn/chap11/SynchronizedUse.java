package to.msn.wings.selflearn.chap11;

public class SynchronizedUse {
  //private Object lock = new Object();
  private int value = 0;

  public static void main(String[] args) {
    final int TASK_NUM = 100000;
    var th = new Thread[TASK_NUM];
    var tb = new SynchronizedUse();
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
    synchronized(this) {
    //synchronized(lock) {
      this.value++;
    }
  }

//  synchronized void increment() {
//    this.value++;
//  }
}
