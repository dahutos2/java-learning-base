package to.msn.wings.selflearn.chap04.practice;

public class PIf {

  public static void main(String[] args) {
    var point = 75;

    if (point >= 90) {
      System.out.println("優");
    } else if (point >= 70) {
      System.out.println("良");
    } else if (point >= 50) {
      System.out.println("可");
    } else {
      System.out.println("不可");
    }
  }
}
