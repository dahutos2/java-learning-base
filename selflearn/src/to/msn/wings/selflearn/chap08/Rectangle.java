package to.msn.wings.selflearn.chap08;

public class Rectangle extends Shape {
  public Rectangle(double width, double height) {
    super(width, height);
  }

  @Override
  public double getArea() {
    return this.width * this.height;
  }
}