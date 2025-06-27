package to.msn.wings.selflearn.chap08.practice;

public class Practice4Sub extends Practice4 {

  @Override
  public String show() {
    return String.format("[%s]", super.show());
  }
}
