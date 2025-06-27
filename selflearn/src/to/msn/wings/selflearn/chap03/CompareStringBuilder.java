package to.msn.wings.selflearn.chap03;

public class CompareStringBuilder {

  public static void main(String[] args) {
    var builder1 = new StringBuilder("あいう");
    var builder2 = new StringBuilder("あいう");
    System.out.println(builder1 == builder2);
  }
}
