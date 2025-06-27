package to.msn.wings.selflearn.chap08.nginherit;

public class Person {
  String name;
  int age;

  public Person() {}

  public final String show() {
    return String.format("%s（%d歳）です。", this.name, this.age);
  }
}
