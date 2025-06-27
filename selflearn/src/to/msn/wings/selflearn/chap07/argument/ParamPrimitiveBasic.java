package to.msn.wings.selflearn.chap07.argument;

public class ParamPrimitiveBasic {

  public static void main(String[] args) {
    var num = 2;
    var p = new ParamPrimitive();
    System.out.println(p.update(num));
    System.out.println(num);
  }
}
