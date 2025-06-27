package to.msn.wings.selflearn.chap06;

import java.util.LinkedHashMap;

public class MapHashLinked {

  public static void main(String[] args) {
    var data = new LinkedHashMap<String, String>(10, 0.7f, true) {
      {
        put("aaa", "あいうえお");
        put("bbb", "かきくけこ");
        put("ccc", "さしすせそ");
        put("ddd", "たちつてと");
      }
    };
    System.out.println(data.get("ccc"));
    System.out.println(data.get("aaa"));
    System.out.println(data.get("bbb"));
    System.out.println(data.get("ddd"));

    System.out.println(data);
  }
}
