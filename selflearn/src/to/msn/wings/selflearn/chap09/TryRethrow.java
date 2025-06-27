package to.msn.wings.selflearn.chap09;

public class TryRethrow {
  public static void rethrow(boolean flag) throws MySampleException, MyLibException {
    try {
      if (flag) {
        throw new MySampleException();
      } else {
        throw new MyLibException();
      }
    } catch (Exception e) {
      throw e;
    }
  }
}
