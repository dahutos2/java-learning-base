package to.msn.wings.selflearn.chap11;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureAll {

  public static int myTask(String name) {
    var r = new Random();
    var num = r.nextInt(3000);
    heavy(num);
    System.out.println(name + ": " + num);
    return num;
  }

  public static void main(String[] args) {
    var list = List.of(
        CompletableFuture.supplyAsync(() -> myTask("First")),
        CompletableFuture.supplyAsync(() -> myTask("Second")),
        CompletableFuture.supplyAsync(() -> myTask("Third"))
    );

    CompletableFuture.allOf(list.toArray(new CompletableFuture[list.size()])).whenComplete((result, ex) -> {
      if (ex == null) {
        System.out.println("---------------------------");
        list.forEach((future) -> {
          try {
            System.out.println(future.get());
          } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
          }
        });
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
