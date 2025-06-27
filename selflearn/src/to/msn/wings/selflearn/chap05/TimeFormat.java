package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeFormat {

  public static void main(String[] args) {
    var dt1 = LocalDateTime.of(2019, 1, 10, 10, 20, 30);
    var dt2 = ZonedDateTime.of(2019, 1, 10, 10, 20, 30, 0, ZoneId.of("Asia/Tokyo"));

    System.out.println(dt1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    System.out.println(dt2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
    System.out.println(dt1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
    System.out.println(dt2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
  }
}
