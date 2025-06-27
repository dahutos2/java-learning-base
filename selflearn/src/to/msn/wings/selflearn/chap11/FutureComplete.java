package to.msn.wings.selflearn.chap11;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FutureComplete {

  public static void main(String[] args) {
    CompletableFuture.supplyAsync(() -> {
      var r = new Random();
      var num = r.nextInt(1000);
      heavy(num);
      return num;
    })
      .whenCompleteAsync((result, ex) -> {
        if (ex == null) {
          System.out.println(result);
        } else {
          System.out.println(ex.getMessage());
        }
      });
    heavy(7000);
  }

  public static void heavy(int num) {
    try {
      Thread.sleep(num);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
