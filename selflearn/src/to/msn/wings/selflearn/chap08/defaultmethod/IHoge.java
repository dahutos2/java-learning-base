package to.msn.wings.selflearn.chap08.defaultmethod;

public interface IHoge {
  default void log(String msg) {
    System.out.println("IHoge: " + msg);
  }
}
