package to.msn.wings.selflearn.chap07.scope;

public class Scope {
  public String data = "フィールド";

  public String show() {
    var data = "ローカル";
    return data;
    // return this.data;
  }
}
