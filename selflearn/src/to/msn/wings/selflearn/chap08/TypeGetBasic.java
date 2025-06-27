package to.msn.wings.selflearn.chap08;

public class TypeGetBasic {

  public static void main(String[] args) {
    Person p1 = new Person();
    System.out.println(p1.getClass());
    Person p2 = new BusinessPerson();
    System.out.println(p2.getClass());
  }
}
