package to.msn.wings.selflearn.chap05;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;

public class CalUse {

  public static void main(String[] args) {
    var cal1 = Calendar.getInstance();
    var cal2 = Calendar.getInstance();
    cal1.set(2019, 0, 10, 10, 20, 30);
    cal2.set(2019, 0, 10, 10, 20, 30);

    System.out.println(cal1.get(Calendar.YEAR) + "年" +
        (cal1.get(Calendar.MONTH) + 1) + "月" +
        cal1.get(Calendar.DATE) + "日");
    cal1.add(Calendar.YEAR, 1);
    System.out.println(cal1.getTime());

    var diff = (int) ((cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (
      1000 * 60 * 60 * 24));
    System.out.println(diff + "日差");

    System.out.println(cal1.equals(cal2));
    System.out.println(cal1.before(cal2));
    System.out.println(cal1.after(cal2));

    var fdatetime = DateFormat.getDateTimeInstance
      (DateFormat.FULL, DateFormat.FULL);
    System.out.println(fdatetime.format(cal2.getTime()));

    try {
      System.out.println(DateFormat.getInstance().parse("2019/1/10 10:20:30"));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
