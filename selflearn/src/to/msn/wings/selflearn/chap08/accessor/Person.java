package to.msn.wings.selflearn.chap08.accessor;

public class Person {
  private String name;
  private int age;

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
    if (age <= 0) {
      throw new IllegalArgumentException("年齢は正数で指定してください。");
    }
    this.age = age;
  }

  public String show() {
    return String.format("%s（%d歳）です。", getName(), getAge());
  }
}