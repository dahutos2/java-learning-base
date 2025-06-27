package to.msn.wings.selflearn.chap09.member;

public enum Season {
  //  SPRING(0, "春"),
  //  SUMMER(1, "夏"),
  //  AUTUMN(2, "秋"),
  //  WINTER(4, "冬");

  SPRING(0, "春") {
    @Override
    public void show() {
      System.out.println("春はあけぼの");
    }
  },
  SUMMER(1, "夏") {
    @Override
    public void show() {
      System.out.println("夏は夜");
    }
  },
  AUTUMN(2, "秋") {
    @Override
    public void show() {
      System.out.println("秋は夕暮れ");
    }
  },
  WINTER(4, "冬") {
    @Override
    public void show() {
      System.out.println("冬はつとめて");
    }
  };

  private int code;
  private String jpName;

  private Season(int code, String jpName) {
    this.code = code;
    this.jpName = jpName;
  }

  public int toSeasonValue() {
    return this.code;
  }

  @Override
  public String toString() {
    return this.jpName;
  }

  public abstract void show();
}
