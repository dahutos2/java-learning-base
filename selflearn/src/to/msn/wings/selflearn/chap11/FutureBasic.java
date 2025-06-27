package to.msn.wings.selflearn.chap11;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FutureBasic {

  public static void main(String[] args) {
    CompletableFuture.supplyAsync(() -> {
      var r = new Random();
      var num = r.nextInt(1000);
      heavy(num);
      return num;
    })
      .thenAcceptAsync((result) -> {
        System.out.println(result);
      });
    System.out.println("...任意の後処理...");
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
