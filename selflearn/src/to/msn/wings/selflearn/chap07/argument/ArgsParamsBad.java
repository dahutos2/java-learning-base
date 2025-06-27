package to.msn.wings.selflearn.chap07.argument;

public class ArgsParamsBad {
  public int totalProducts(int... values) {
    if (values.length == 0) {
      throw new IllegalArgumentException("1つ以上の引数を指定してください。");
    }
    var result = 1;
    for (var value : values) {
      result *= value;
    }
    return result;
  }
}
