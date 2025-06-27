package to.msn.wings.selflearn.chap11.practice;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Practice4 {

  public static void main(String[] args) {
    CompletableFuture.supplyAsync(() -> {
      var r = new Random();
      var num = r.nextInt(2000);
      heavy(num);
      System.out.printf("処理1: %d\n", num);
      return num;
    })
      .thenApplyAsync((data) -> {
        var num = data * 2;
        heavy(num);
        System.out.printf("処理2: %d\n", num);
        return num;
      })
      .thenAcceptAsync((data) -> {
        var num = data * 2;
        heavy(num);
        System.out.printf("処理3: %d\n", num);
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
