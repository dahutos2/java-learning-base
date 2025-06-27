package to.msn.wings.selflearn.chap07.scope;

public class ScopeBlock {

  public static void main(String[] args) {

    /*
    // ローカル変数と同名のブロックスコープ変数を宣言
    var data = "ローカルスコープ";
    {
      var data = "ブロックスコープ";
    }
    */

    {
      var data = "ブロックスコープ";
    }
    var data = "ローカルスコープ";
    System.out.println(data);
  }
}
