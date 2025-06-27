package to.msn.wings.selflearn.chap08.hiding;

public class HideBasic {

  public static void main(String[] args) {
    var bp = new BusinessPerson();
    System.out.println(bp.birth);
    bp.show();

    Person p = new BusinessPerson();
    System.out.println(p.birth);
  }
}
