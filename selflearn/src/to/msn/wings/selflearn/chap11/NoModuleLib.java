package to.msn.wings.selflearn.chap11;

import com.google.gson.Gson;

public class NoModuleLib {

  public static void main(String[] args) {
    var g = new Gson();
    var a = new Article("Java 11の変更点", "https://codezine.jp/article/corner/751");
    System.out.println(g.toJson(a));
  }
}
