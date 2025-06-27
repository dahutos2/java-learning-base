package to.msn.wings.selflearn.chap08;

public class InheritBaseCall {

  public static void main(String[] args) {
    var ebp = new EliteBusinessPerson();
    ebp.name = "山田太郎";
    ebp.age = 30;
    System.out.println(ebp.work());
  }
}
