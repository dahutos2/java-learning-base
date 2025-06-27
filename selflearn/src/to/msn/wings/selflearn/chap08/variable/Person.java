package to.msn.wings.selflearn.chap08.variable;

import java.util.Date;

public final class Person {
  private final String name;
  private final int age;
  private final Date birth;

  public Person(String name, int age, Date birth) {
    this.name = name;
    this.age = age;
    this.birth = birth;
//    this.birth = new Date(birth.getTime());
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public Date getBirth() {
    return this.birth;
//    return new Date(this.birth.getTime());
  }
}