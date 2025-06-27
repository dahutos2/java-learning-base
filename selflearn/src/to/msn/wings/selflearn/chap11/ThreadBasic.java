package to.msn.wings.selflearn.chap11;

public class ThreadBasic {

  public static void main(String[] args) {
    var th1 = new MyThread();
    var th2 = new MyThread();
    var th3 = new MyThread();

    th1.start();
    th2.start();
    th3.start();
  }
}
