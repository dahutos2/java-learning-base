package to.msn.wings.selflearn.chap10;

import java.util.HashMap;
import java.util.Map;

public class CollCompute {
  public static String trans(String key, String value) {
    return key.charAt(0) + value;
  }

  public static String trans(String key) {
    return key;
  }

  public static void main(String[] args) {
    var map = new HashMap<String, String>(Map.of("orange", "みかん"));

      map.compute("orange", CollCompute::trans);
      map.compute("melon", CollCompute::trans);
      System.out.println(map);

//      map.computeIfPresent("orange", CollCompute::trans);
//      map.computeIfPresent("melon", CollCompute::trans);
//      System.out.println(map);

//    map.computeIfAbsent("orange", CollCompute::trans);
//    map.computeIfAbsent("melon", CollCompute::trans);
//    System.out.println(map);
  }
}
