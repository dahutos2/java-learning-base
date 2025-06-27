package to.msn.wings.selflearn.chap09.clone2;

public class CloneVariable {

  public static void main(String[] args) {
    var p1 = new Person("太郎", "山田", new String[] {"Aクラス", "班長"});
    var p2 = p1.clone();
    System.out.println(p2);
  }
}
