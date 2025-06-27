package to.msn.wings.selflearn.chap07.argument;

public class ArgsParams {
  public int totalProducts(int... values) {
  // public int totalProducts(int[] values) {
    var result = 1;
    for (var value : values) {
      result *= value;
    }
    return result;
  }
}
