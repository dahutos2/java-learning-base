package to.msn.wings.selflearn.chap08.practice;

public class Hamster implements IAnimal {
  private String name;

  public Hamster(String name) {
    this.name = name;
  }

  @Override
  public void move() {
    System.out.printf("%sは、トコトコ歩きます。", this.name);
  }
}
