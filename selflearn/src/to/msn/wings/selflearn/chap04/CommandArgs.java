package to.msn.wings.selflearn.chap04;

public class CommandArgs {

  public static void main(String[] args) {
    for (var value : args) {
      System.out.println("こんにちは、" + value + "さん!");
    }
  }
}
