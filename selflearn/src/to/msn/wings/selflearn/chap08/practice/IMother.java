package to.msn.wings.selflearn.chap08.practice;

public interface IMother {
  default void run() {
    System.out.println("I am a mother.");
  }
}
