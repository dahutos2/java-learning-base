package to.msn.wings.selflearn.chap08.practice;

public class Practice4Client {

  public static void main(String[] args) {
    var ps = new Practice4Sub();
    ps.value = 123.456;
    System.out.println(ps.show());
  }

}
