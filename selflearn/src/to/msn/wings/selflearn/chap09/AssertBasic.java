package to.msn.wings.selflearn.chap09;

public class AssertBasic {
  private static double getTrapezoidArea(double upper, double lower, double height) {
    assert upper > 0 && lower > 0 && height > 0;
    return (upper + lower) * height / 2;
  }
  public static void main(String[] args) {
    System.out.println(AssertBasic.getTrapezoidArea(-2, 4, 0));
  }
}