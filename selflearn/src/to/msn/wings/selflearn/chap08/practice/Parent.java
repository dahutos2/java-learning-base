package to.msn.wings.selflearn.chap08.practice;

public class Parent extends Person implements IFather, IMother {
  public void run() {
    IFather.super.run();
    IMother.super.run();
  }
}
