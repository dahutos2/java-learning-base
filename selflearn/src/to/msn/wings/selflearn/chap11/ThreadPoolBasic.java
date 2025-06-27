package to.msn.wings.selflearn.chap11;

import java.util.concurrent.Executors;

public class ThreadPoolBasic {

  public static void main(String[] args) {
    var es = Executors.newFixedThreadPool(10);
    es.execute(new ThreadPool());
    es.execute(new ThreadPool());
    es.execute(new ThreadPool());
    es.shutdown();
  }
}
