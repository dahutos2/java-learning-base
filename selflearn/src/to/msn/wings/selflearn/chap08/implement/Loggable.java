package to.msn.wings.selflearn.chap08.implement;

public interface Loggable {
  default void log(String msg) {
    System.out.println("Log: " + msg);
  }
}
