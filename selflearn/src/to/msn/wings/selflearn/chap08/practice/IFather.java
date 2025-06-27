package to.msn.wings.selflearn.chap08.practice;

public interface IFather {
  default void run() {
    System.out.println("I am a father.");
  }
}
