package to.msn.wings.selflearn.chap05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class TimeNow {

  public static void main(String[] args) {
    System.out.println(LocalDateTime.now());
    System.out.println(OffsetDateTime.now());
    System.out.println(ZonedDateTime.now());
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
  }
}
