package to.msn.wings.selflearn.chap04;

public class BreakNest2 {

  public static void main(String[] args) {
    limit:
    for (var i = 1; i < 10; i++) {
      for (var j = 1; j < 10; j++) {
        var result = i * j;
        if (result > 50) {
          break limit;
        }
        System.out.printf(" %2d", result);
      }
      System.out.println();
    }
  }
}
