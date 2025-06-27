package to.msn.wings.selflearn.chap10;

import java.util.function.Consumer;

public class MethodLambda {

  public void walkArray(String[] data, Consumer<String> output) {
    for (var value : data) {
      output.accept(value);
    }
  }
}
