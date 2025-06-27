package to.msn.wings.selflearn.chap11;

public class MyThread extends Thread {
  @Override
  public void run() {
    for (var i = 0; i < 30; i++) {
      System.out.println(this.getName() + ": " + i);
    }
  }
}
