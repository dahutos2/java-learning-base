package to.msn.wings.selflearn.chap05.practice;

public class PSplit {

  public static void main(String[] args) {
    var str = "鈴木\t太郎\t男\t50歳\t広島県";
    var result = str.split("\t");
    System.out.println(String.join("＆", result));
  }
}
