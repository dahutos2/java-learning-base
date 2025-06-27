package to.msn.wings.selflearn.chap08;

public class EliteBusinessPerson extends BusinessPerson {

  @Override
  public String work() {
    var result = super.work();
    return String.format("%sいつでもテキパキと", result);
  }
}