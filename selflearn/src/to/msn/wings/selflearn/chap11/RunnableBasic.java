package to.msn.wings.selflearn.chap11;

public class RunnableBasic {

  public static void main(String[] args) {
    var th1 = new Thread(new MyRunner());
    var th2 = new Thread(new MyRunner());
    var th3 = new Thread(new MyRunner());
    th1.start();
    th2.start();
    th3.start();
  }
}
