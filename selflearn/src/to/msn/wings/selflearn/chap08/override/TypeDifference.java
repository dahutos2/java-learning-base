package to.msn.wings.selflearn.chap08.override;

public class TypeDifference {

  public static void main(String[] args) {
    Person p = new BusinessPerson();
    p.name = "山田太郎";
    p.age = 30;
    // System.out.println(p.work());
    System.out.println(p.show());
  }
}
