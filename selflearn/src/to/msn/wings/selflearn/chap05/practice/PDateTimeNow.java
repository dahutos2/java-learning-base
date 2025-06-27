package to.msn.wings.selflearn.chap05.practice;

import java.time.LocalDateTime;

public class PDateTimeNow {

  public static void main(String[] args) {
    var dt = LocalDateTime.now();
    System.out.println(dt.getMonthValue() + "月");
    System.out.println(dt.getMinute() + "分");
  }
}
