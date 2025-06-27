package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;

public class TimeGet {

  public static void main(String[] args) {
    var dt = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 123);
    System.out.println(dt.getYear() + "年" +
      dt.getMonthValue() + "月" +
      dt.getDayOfMonth() + "日 " +
      dt.getDayOfWeek() + " " +
      dt.getHour() + "時" +
      dt.getMinute() + "分"
      + dt.getSecond() + "秒"
      + dt.getNano() + "ナノ秒");
    System.out.println("月名は" + dt.getMonth() +
      " 今年" + dt.getDayOfYear() + "日目");
  }
}
