package to.msn.wings.selflearn.chap07.practice;

public class Hamster {
  public String name;
  public int age;

  public Hamster(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Hamster() {
    this("権兵衛", 0);
  }

  public void show() {
    System.out.printf("%s（%d歳）です。\n", this.name, this.age);
  }
}
