package to.msn.wings.selflearn.chap09;

public class EnumSeason {
  public void processSeason(Season season) {
    System.out.println(season);
  }

  public static void main(String[] args) {
    var es = new EnumSeason();
    es.processSeason(Season.SPRING);
    // es.processSeason(4);
    // es.processSeason(EnumConstMonth.JANUARY);
  }
}
