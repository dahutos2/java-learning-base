package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollUnmodifyRef {

  public static void main(String[] args) {
    var data = new ArrayList<StringBuilder>(Arrays.asList(
        new StringBuilder("ひふみ"),
        new StringBuilder("よいむ"),
        new StringBuilder("なやこ")));
    var udata = Collections.unmodifiableList(data);
    udata.get(0).append("いちにさん");
    System.out.println(udata);
  }
}
