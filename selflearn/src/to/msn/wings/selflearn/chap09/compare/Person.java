package to.msn.wings.selflearn.chap09.compare;

public class Person implements Comparable<Person> {
  private String firstNameKana;
  private String lastNameKana;

  public Person(String firstNameKana, String lastNameKana) {
    this.firstNameKana = firstNameKana;
    this.lastNameKana = lastNameKana;
  }

  @Override
  public int compareTo(Person o) {
    if (this.lastNameKana.equals(o.lastNameKana)) {
      return this.firstNameKana.compareTo(o.firstNameKana);
    } else {
      return this.lastNameKana.compareTo(o.lastNameKana);
    }
  }

  @Override
  public String toString() {
    return this.lastNameKana + " " + this.firstNameKana;
  }
}
