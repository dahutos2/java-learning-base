package to.msn.wings.selflearn.chap10.lambda;

public class Person {
  public String name;
  public int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("%s（%d歳）", this.name, this.age);
  }
}