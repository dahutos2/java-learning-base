package to.msn.wings.selflearn.chap07.method;

public class OverloadAntiClient {

  public static void main(String[] args) {
    var c = new OverloadAnti();
    var list = new CharSequence[] {
        "春はあけぼの",
        new StringBuilder("夏は夜"),
        new StringBuffer("秋は夕暮れ"),
    };

    for (var cs : list) {
      c.show(cs);
    }
  }
}
