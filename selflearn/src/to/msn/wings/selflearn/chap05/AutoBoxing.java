package to.msn.wings.selflearn.chap05;

public class AutoBoxing {

  public static void main(String[] args) {
    Long result = 0L;

    for (var i = 1; i < 10000; i++) {
      result += i;
    }
    System.out.println(result);
  }
}
