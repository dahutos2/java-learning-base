package to.msn.wings.selflearn.chap08.defaultmethod;

public interface IHoge2 {
  default void log(String msg) {
    System.out.println("IHoge2: " + msg);
  }
}
