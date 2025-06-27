package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TimeFormatLocale {

  public static void main(String[] args) {
    var locale = Locale.JAPAN;
    // var locale = Locale.US;
    var zone = ZoneId.of("Asia/Tokyo");
    // var zone = ZoneId.of("America/Chicago");
    var dt = ZonedDateTime.of(LocalDateTime.now(), zone);

    System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(
      FormatStyle.FULL).withLocale(locale)));
    System.out.println(dt.format(DateTimeFormatter.ofPattern(
      "Y年L月d日（E）a K時m分s秒 (z)", locale)));
  }
}
