package to.msn.wings.selflearn.chap08.delegation;

public class RouletteClient {

  public static void main(String[] args) {
    var rou = new Roulette(10);
    System.out.println(rou.nextInt());
  }
}
