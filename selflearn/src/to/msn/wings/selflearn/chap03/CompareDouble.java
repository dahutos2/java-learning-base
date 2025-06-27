package to.msn.wings.selflearn.chap03;

public class CompareDouble {

  public static void main(String[] args) {
    final double EPSILON = 0.00001;
    var x = 0.2 * 3;
    var y = 0.6;
    System.out.println(Math.abs(x - y) < EPSILON);
  }
}
