package to.msn.wings.selflearn.chap07.method2;

public class Person {
  public String name;
  public int age;

  public void show() {
    System.out.printf("%s（%d歳）です。\n", this.name, this.age);
  }
}
