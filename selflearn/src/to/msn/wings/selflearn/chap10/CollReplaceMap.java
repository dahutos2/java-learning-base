package to.msn.wings.selflearn.chap10;

import java.util.HashMap;
import java.util.Map;

public class CollReplaceMap {

  public static void main(String[] args) {
    var map = new HashMap<String, String>(
      Map.of("orange", "みかん", "apple", "りんご", "strawberry", "いちご"));
    map.replaceAll((k, v) -> k.charAt(0) + v);
    System.out.println(map);
  }
}
