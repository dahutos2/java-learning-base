package to.msn.wings.selflearn.chap03.practice;

public class Practice2 {

  public static void main(String[] args) {
    var x = 6;
    var y = x;
    y -= 2;

    var builder1 = new StringBuilder("いろは");
    var builder2 = builder1;
    builder1.append("にほへと");
    System.out.println(x);
    System.out.println(y);
    System.out.println(builder1);
    System.out.println(builder2);
  }
}
