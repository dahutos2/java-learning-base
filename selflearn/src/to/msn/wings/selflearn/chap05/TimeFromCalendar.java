package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class TimeFromCalendar {

  public static void main(String[] args) {
    var cal = Calendar.getInstance();
    var dt1 = LocalDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());
    var dt2 = OffsetDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());
    var dt3 = ZonedDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());
    System.out.println(dt1);
    System.out.println(dt2);
    System.out.println(dt3);
  }
}
