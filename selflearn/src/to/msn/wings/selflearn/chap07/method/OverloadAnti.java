package to.msn.wings.selflearn.chap07.method;

public class OverloadAnti {

  public void show(String value) {
    System.out.println("String: " + value);
  }

  public void show(StringBuilder builder) {
    System.out.println("StringBuilder：" + builder);
  }
  public void show (StringBuffer buf) {
    System.out.println("StringBuffer：" + buf);
  }
  public void show(CharSequence cs) {
    System.out.println("CharSequence：" + cs);
  }
}
