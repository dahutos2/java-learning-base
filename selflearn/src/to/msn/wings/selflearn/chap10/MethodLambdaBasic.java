package to.msn.wings.selflearn.chap10;

// import java.util.function.Consumer;

public class MethodLambdaBasic {

  public static void main(String[] args) {
    var data = new String[] { "春はあけぼの", "夏は夜", "秋は夕暮れ" };
    var ml = new MethodLambda();
    ml.walkArray(data, (String value) -> {
      System.out.printf("[%s]\n", value);
    });

//    ml.walkArray(data, new Consumer<String>() {
//      @Override
//      public void accept(String value) {
//        System.out.printf("[%s]\n", value);
//      }
//    });


    // ml.walkArray(data, (String value) -> System.out.printf("[%s]\n", value));

    // ml.walkArray(data, (value) -> System.out.printf("[%s]\n", value));

    // ml.walkArray(data, value -> System.out.printf("[%s]\n", value));
  }
}
