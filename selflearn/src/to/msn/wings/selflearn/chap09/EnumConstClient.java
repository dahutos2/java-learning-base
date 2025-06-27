package to.msn.wings.selflearn.chap09;

public class EnumConstClient {

  public static void main(String[] args) {
    var ecs = new EnumConstSeason();
    ecs.processSeason(EnumConstSeason.SPRING);
    ecs.processSeason(4);
    ecs.processSeason(EnumConstMonth.JANUARY);
  }
}
