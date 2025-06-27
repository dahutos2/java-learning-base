package to.msn.wings.selflearn.chap04.practice;

public class PFor {

  public static void main(String[] args) {
    for (var i = 1; i < 10; i++) {
      for (var j = 1; j < 10; j++) {
        var result = i * j;
        System.out.print(result + " ");
      }
      System.out.println();
    }
  }
}
