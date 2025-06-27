package to.msn.wings.selflearn.chap07.staticfield2;

public class ConstantInstance {
  public static void main(String[] args) {
    var app1 = new MyApp("独習Java");
    System.out.println(app1.APP_NAME);
    var app2 = new MyApp("Teach Yourself Java");
    System.out.println(app2.APP_NAME);
  }
}
