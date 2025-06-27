package to.msn.wings.selflearn.chap08;

//public class Shape {
public abstract class Shape {
  protected double width;
  protected double height;

  public Shape(double width, double height) {
    this.width = width;
    this.height = height;
  }

//  public  double getArea() {
//    return 0d;
//  }
  public abstract double getArea();
}
