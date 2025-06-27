package to.msn.wings.selflearn.chap07.scope2;

public class ScopeBlock {

  public static void main(String[] args) {
    {
      var data = "ブロックスコープ";
      System.out.println(data);
    }

    {
      var data = "ブロックスコープ2";
      System.out.println(data);
    }
  }
}
