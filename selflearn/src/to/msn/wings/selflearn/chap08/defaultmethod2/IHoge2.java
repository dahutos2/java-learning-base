package to.msn.wings.selflearn.chap08.defaultmethod2;

public interface IHoge2 extends IParent{
  default void log(String msg) {
    System.out.println("IHoge2: " + msg);
  }
}
