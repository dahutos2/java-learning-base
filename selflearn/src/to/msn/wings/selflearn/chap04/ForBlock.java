package to.msn.wings.selflearn.chap04;

public class ForBlock {

  public static void main(String[] args) {
    for (var i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        i++;
      }
      System.out.println(i);
    }
  }
}
