package to.msn.wings.selflearn.chap06;

import java.util.Map;
import java.util.TreeMap;

public class MapTree {

  public static void main(String[] args) {
    var data = new TreeMap<String, String>(Map.of("Rose", "バラ",
        "Sunflower", "ひまわり", "Morning Glory", "あさがお"));
    for (var key : data.keySet()) {
      System.out.println(key);
    }
  }
}
