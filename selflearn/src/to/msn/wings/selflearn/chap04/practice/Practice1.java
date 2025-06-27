package to.msn.wings.selflearn.chap04.practice;

public class Practice1 {

  public static void main(String[] args) {
    for (var value : args) {
      var i = Integer.parseInt(value);
      System.out.println(i * 1.5);
    }
  }
}
