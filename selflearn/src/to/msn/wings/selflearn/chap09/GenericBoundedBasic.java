package to.msn.wings.selflearn.chap09;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericBoundedBasic {

  public static void main(String[] args) {
    var cli = new GenericBounded();
    var data1 = new ArrayList<Parent>(Arrays.asList(
      new Parent("かえる"), new Parent("にわとり"), new Parent("とんぼ")));

    var data2 = new ArrayList<Child>(Arrays.asList(
      new Child("おたまじゃくし"), new Child("ひよこ"), new Child("やご")));
    cli.show(data1);
    cli.show(data2);
  }
}
