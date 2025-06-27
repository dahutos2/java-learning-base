package to.msn.wings.selflearn.chap08.practice;

public class Animal {
  private String name;
  private int age;

  public Animal() {
    this("名無権兵衛", 0);
  }

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    if (age < 0) {
      age = 0;
    }
    this.age = age;
  }

  public String intro() {
    return String.format("わたしの名前は%s。%d歳です。", getName(), getAge());
  }
}