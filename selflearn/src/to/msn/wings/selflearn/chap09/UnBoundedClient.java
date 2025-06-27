package to.msn.wings.selflearn.chap09;

import java.util.ArrayList;
import java.util.Arrays;

public class UnBoundedClient {

  public static void main(String[] args) {
    var data = new ArrayList<String>(Arrays.asList("バラ", "ひまわり", "あさがお"));
//    var data = new ArrayList<Parent>(Arrays.asList(
//        new Parent("かえる"), new Parent("にわとり"), new Parent("とんぼ")));
    UnBounded.showList(data);
  }
}
