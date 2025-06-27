package to.msn.wings.selflearn.chap09.clone2;

public class Person implements Cloneable {
  private String firstName;
  private String lastName;
  private String[] memos;

  public Person(String firstName, String lastName, String[] memos) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.memos = memos;
  }

  @Override
  public Person clone() {
    Person p = null;
    try {
      p = (Person) super.clone();
      p.memos = this.memos.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
    return p;
  }

  @Override
  public String toString() {
    return  String.format("%s%s（%s）",
        this.lastName, this.firstName, this.memos[1]);
  }
}
