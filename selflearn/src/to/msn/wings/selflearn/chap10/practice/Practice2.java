package to.msn.wings.selflearn.chap10.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Practice2 {
    public static <T> List<T> grep(List<T> list, Predicate<T> cond) {
      var result = new ArrayList<T>();
      for(var value : list) {
        if (cond.test(value)) {
          result.add(value);
        }
      }
      return result;
    }

    public static void main(String[] args) {
      var data = List.of("ラベンダー", "ミント", "ローズマリー");
      var result = grep(data, v -> v.length() > 3);
      System.out.println(result);
    }
}
