package to.msn.wings.selflearn.chap10;

public class CounterBasic {

  public static void main(String[] args) {
    var data = new String[] {"春はあけぼの", "夏は夜", "秋は夕暮れ"};
    var u = new MethodRefUse();
    var c = new Counter();
    u.walkArray(data, c::addLength);
    System.out.println(c.getResult());
  }
}
