package to.msn.wings.selflearn.chap11.practice;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Practice2 {

  public static void main(String[] args) {
    try {
      var exe = Executors.newSingleThreadExecutor();
      var r = exe.submit(() -> {
        var rnd = new Random();
        var num = rnd.nextInt(1000);
        Thread.sleep(num);
        return num;
      });
      System.out.println("結果: " + r.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
}
