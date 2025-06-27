package to.msn.wings.selflearn.chap07.staticfield;

public class MySingleton {
  private static MySingleton instance = new MySingleton();

  private MySingleton() {}

  public static MySingleton getInstance() {
    return instance;
  }
}
