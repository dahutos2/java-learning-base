package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;

public class CollForeach {

  public static void main(String[] args) {
    var data = new ArrayList<String>() {
      {
        add("バラ");
        add("ひまわり");
        add("あさがお");
      }
    };

    for (var s : data) {
      System.out.println(s);
    }

//    var itr = data.iterator();
//    while (itr.hasNext()) {
//      System.out.println(itr.next());
//    }
  }
}
