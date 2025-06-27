package to.msn.wings.selflearn.chap09.clone;

public class Person implements Cloneable {
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public Person clone() {
    Person p = null;
    try {
      p = (Person)super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
    return p;
  }

  @Override
  public String toString() {
    return this.lastName + this.firstName;
  }
}
