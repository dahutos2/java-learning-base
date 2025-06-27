package to.msn.wings.selflearn.chap08;

public class PolymorphismBasic {

  public static void main(String[] args) {
    Shape tri = new Triangle(10, 50);
    Shape rec = new Rectangle(10, 50);
    System.out.println(tri.getArea());
    System.out.println(rec.getArea());
  }
}
