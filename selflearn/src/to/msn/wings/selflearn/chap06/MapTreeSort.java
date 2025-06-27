package to.msn.wings.selflearn.chap06;

// import java.util.Comparator;
import java.util.TreeMap;

public class MapTreeSort {

  public static void main(String[] args) {
    var data = new TreeMap<String, String>(
        (x, y) -> x.length() - y.length()
      );

//    var data = new TreeMap<String, String>(new Comparator<String>(){
//      @Override
//      public int compare(String x, String y) {
//        return x.length() - y.length();
//      }
//    });

      data.put("Rose", "バラ");
      data.put("Sunflower", "ひまわり");;
      data.put("Morning Glory", "あさがお");
      System.out.println(data);
  }
}
