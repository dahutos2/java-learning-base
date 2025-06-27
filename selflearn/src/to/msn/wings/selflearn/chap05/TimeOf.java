package to.msn.wings.selflearn.chap05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeOf {

  public static void main(String[] args) {
    var ldt1 = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 513);
    var ldt2 = LocalDateTime.of(2019, Month.JANUARY, 10, 10, 20, 30);
    //var ldt3 = LocalDateTime.of(2019, 1, 40, 10, 20, 30);
    System.out.println(ldt1);
    System.out.println(ldt2);
    //System.out.println(ldt3);

    var ld = LocalDate.of(2019, 1, 10);
    System.out.println(ld);
    var lt = LocalTime.of(10, 20, 30);
    System.out.println(lt);
    var ldt4 = LocalDateTime.of(ld, lt);
    System.out.println(ldt4);

    var odt = OffsetDateTime.of(2019, 1, 10, 10, 20, 30, 999, ZoneOffset.ofHours(9));
    System.out.println(odt);

    var ot = OffsetTime.of(10, 20, 30, 999, ZoneOffset.ofHours(9));
    System.out.println(ot);

    var zdt = ZonedDateTime.of(2019, 1, 10, 10, 20, 30, 999, ZoneId.of("Asia/Tokyo"));
    System.out.println(zdt);
  }
}
