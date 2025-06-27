package to.msn.wings.selflearn.chap11;

public class AnonymousThread {

  public static void main(String[] args) {
    var th1 = new Thread() {
      @Override
      public void run() {
        for (var i = 0; i < 30; i++) {
          System.out.println(this.getName() + ": " + i);
        }
      }
    };

    var th2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (var i = 0; i < 30; i++) {
          System.out.println(Thread.currentThread().getName() + ": " + i);
        }
      }
    });

//    var th2 = new Thread(() -> {
//      for (var i = 0; i < 30; i++) {
//        System.out.println(Thread.currentThread().getName() + ": " + i);
//      }
//    });
    th1.start();
    th2.start();
  }
}
