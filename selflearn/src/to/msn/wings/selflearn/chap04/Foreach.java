package to.msn.wings.selflearn.chap04;

public class Foreach {

  public static void main(String[] args) {
    var data = new String[] { "うめ", "さくら", "もも" };
    for (var value : data) {
      System.out.println(value);
    }
  }
}
