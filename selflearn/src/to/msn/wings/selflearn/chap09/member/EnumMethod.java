package to.msn.wings.selflearn.chap09.member;

public class EnumMethod {

  public static void main(String[] args) {
    for (var se: Season.values()) {
      se.show();
    }
  }
}
