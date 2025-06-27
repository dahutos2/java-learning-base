package to.msn.wings.selflearn.chap08.implement;

public class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return this.width * this.height;
  }
}
