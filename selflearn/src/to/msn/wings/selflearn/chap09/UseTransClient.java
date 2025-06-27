package to.msn.wings.selflearn.chap09;

public class UseTransClient {

  public static void main(String[] args) {
    var ut = new UseTrans();
    try {
      ut.readHttpPages();
    } catch (MySampleException e) {
      e.printStackTrace();
      var ex = e.getCause();
      System.out.println(ex);
    }
  }
}
