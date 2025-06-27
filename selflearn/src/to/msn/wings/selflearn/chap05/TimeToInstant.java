package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class TimeToInstant {

  public static void main(String[] args) {
    var dt = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 123456789);
    var d = Date.from(dt.toInstant(ZoneOffset.of("+09:00")));
    var cal = Calendar.getInstance();
    cal.setTime(d);
    System.out.println(cal);
    }
}
