package to.msn.wings.selflearn.chap10;

public class MethodRefUse {
  public void walkArray(String[] data, Output output) {
    for (var value : data) {
      output.print(value);
    }
  }

  static void addQuote(String value) {
    System.out.printf("[%s]\n", value);
  }
}
