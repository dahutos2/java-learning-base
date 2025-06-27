package to.msn.wings.selflearn.chap10;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamSummary {

  public static void main(String[] args) {
    var summary = IntStream.of(5, 13, 7, 2, 30)
      .collect(
        IntSummaryStatistics::new,
        IntSummaryStatistics::accept,
        IntSummaryStatistics::combine
      );
    System.out.println(summary.getMin());
    System.out.println(summary.getSum());
    System.out.println(summary.getAverage());
  }
}
