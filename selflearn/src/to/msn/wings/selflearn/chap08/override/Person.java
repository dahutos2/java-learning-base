package to.msn.wings.selflearn.chap08.override;

public class Person {
  public String name;
  public int age;

  public String show() {
    return String.format("%s（%d歳）です。", this.name, this.age);
  }
}
