package to.msn.wings.selflearn.chap05;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimePlus2 {

  public static void main(String[] args) {
    var d = LocalDateTime.of(2019, 1, 10, 10, 20, 30);
    var period = Period.ofYears(3);
    var duration = Duration.parse("P21DT1H1M1S");
    System.out.println(d);
    System.out.println(d.plus(period));
    System.out.println(d.minus(duration));
  }
}
