package to.msn.wings.selflearn.chap07.constructor.overload;

public class Person {
  public String name;
  public int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
    this("名無権兵衛", 20);
  }

  public void show() {
    System.out.printf("%s（%d歳）です。\n", this.name, this.age);
  }
}
