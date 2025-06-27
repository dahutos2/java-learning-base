package to.msn.wings.selflearn.chap06;

import java.util.HashMap;
import java.util.Map;

public class MapHash {

  public static void main(String[] args) {
    var map = new HashMap<String, String>(Map.of("Rose", "バラ",
      "Sunflower", "ひまわり", "Morning Glory", "あさがお"));
    System.out.println(map.containsKey("Rose"));
    System.out.println(map.containsValue("バラ"));
    System.out.println(map.isEmpty());

    for (var key : map.keySet()) {
      System.out.println(key);
    }

    for (var value : map.values()) {
      System.out.println(value);
    }
    map.replace("Rose", "薔薇");
    map.replace("Sunflower", "ひまわり", "向日葵");

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
  }
}
