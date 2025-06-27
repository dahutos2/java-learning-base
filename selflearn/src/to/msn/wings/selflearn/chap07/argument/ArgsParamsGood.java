package to.msn.wings.selflearn.chap07.argument;

public class ArgsParamsGood {
  public int totalProducts(int initial, int... values) {
    var result = initial;
    for (var value : values) {
      result *= value;
    }
    return result;
  }
}
