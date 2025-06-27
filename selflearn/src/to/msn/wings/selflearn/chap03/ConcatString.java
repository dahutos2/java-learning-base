package to.msn.wings.selflearn.chap03;

public class ConcatString {

  public static void main(String[] args) {
    var start = System.currentTimeMillis();
    var result = "";
    for (var i = 0; i < 100000; i++) {
      result += "いろは";
    }
    System.out.println(result.length());
    var end = System.currentTimeMillis();
    System.out.println((end - start)  + "ミリ秒");
  }
}
