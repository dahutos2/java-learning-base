package to.msn.wings.selflearn.chap09.equals;

public class Person {
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof Person) {
      var p  = (Person)obj;
      return this.firstName.equals(p.firstName) &&
          this.lastName.equals(p.lastName);
    }
    return false;
  }
}
