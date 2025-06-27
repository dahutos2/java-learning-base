package to.msn.wings.selflearn.chap07.practice;

public class PClass {
  public int data = 10;

  public void hoge(int data) {
    if (data < 0) {
      data = 0;
    }
    System.out.println(data);
  }

  public static void main(String[] args) {
    var p = new PClass();
    p.hoge(10);
    p.hoge(-10);
  }
}
