package to.msn.wings.selflearn.chap07.staticfield;

public class Figure {
  public static double pi = 3.14;

  public static void getCircleArea(double r) {
    System.out.println("円の面積は" +  r * r * pi);
  }
}
