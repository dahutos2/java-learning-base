package to.msn.wings.selflearn.chap08.defaultmethod2;

public interface IParent {
  default void log(String msg) {
    System.out.println("IParent: " + msg);
  }
}
