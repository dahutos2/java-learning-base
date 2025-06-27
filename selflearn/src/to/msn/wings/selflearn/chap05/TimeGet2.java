package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class TimeGet2 {

  public static void main(String[] args) {
    var dt = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 123);
    var week = new String[] {
        "日曜日", "月曜日", "火曜日", "水曜日",
        "木曜日", "金曜日", "土曜日"};

    System.out.println(dt.get(ChronoField.YEAR) + "年" +
        dt.get(ChronoField.MONTH_OF_YEAR) + "月" +
        dt.get(ChronoField.DAY_OF_MONTH) + "日" +
        week[dt.get(ChronoField.DAY_OF_WEEK) -1] + " "+
        dt.get(ChronoField.HOUR_OF_DAY) + "時" +
        dt.get(ChronoField.MINUTE_OF_HOUR) + "分" +
        dt.get(ChronoField.SECOND_OF_MINUTE) + "秒" +
        dt.get(ChronoField.NANO_OF_SECOND) + "ナノ秒");
  }
}
