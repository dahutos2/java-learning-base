package to.msn.wings.selflearn.chap05;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimeBetween {

  public static void main(String[] args) {
    var dt1 = LocalDateTime.of(2018, 12, 31, 0, 0, 0);
    var dt2 = LocalDateTime.of(2020, 3, 3, 10, 20, 30);

    var period = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
    System.out.println("日付の差：" +
      period.getYears() + "年" + period.getMonths() + "ヶ月" +
      period.getDays() + "日間");

    var duration = Duration.between(dt1, dt2);
    System.out.println("時間の差：" + duration.toHours() + "時間");
  }
}
