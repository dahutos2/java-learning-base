package to.msn.wings.selflearn.chap07.constructor;

public class Person {
  public String name;
  public int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String show() {
    return String.format("%s（%d歳）です。", this.name, this.age);
  }
}
