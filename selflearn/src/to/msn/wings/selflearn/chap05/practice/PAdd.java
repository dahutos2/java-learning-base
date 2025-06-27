package to.msn.wings.selflearn.chap05.practice;

import java.time.LocalDate;
import java.time.Period;

public class PAdd {

  public static void main(String[] args) {
    var dt = LocalDate.now();
    var period = Period.ofDays(20);
    System.out.println("20日後は、" + dt.plus(period));
  }
}
