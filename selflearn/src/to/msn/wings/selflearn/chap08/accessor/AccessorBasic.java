package to.msn.wings.selflearn.chap08.accessor;



public class AccessorBasic {

  public static void main(String[] args) {
    var p = new Person();
    p.setName("山田太郎");
    p.setAge(30);
    System.out.println(p.show());
    p.setAge(-30);
  }
}
