package to.msn.wings.selflearn.chap08.defaultmethod;

public class HogeImpl implements IHoge, IHoge2 {
  @Override
  public void log(String msg) {
    IHoge.super.log(msg);
  }
}
