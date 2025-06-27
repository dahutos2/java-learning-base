package mylib.lib;

import mylib.internal.SubLib;

public class MainLib {
  private String name = "privateメンバー";
  public String memo = "publicメンバー";

  public void run() {
    System.out.println("MainLib is running.");
    var sub = new SubLib();
    sub.run();
  }

  public void show() {
    System.out.println(this.name);
  }
}
