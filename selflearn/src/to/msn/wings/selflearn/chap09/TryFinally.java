package to.msn.wings.selflearn.chap09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryFinally {

  public static void main(String[] args) {
    FileInputStream in = null;
    try {
      in = new FileInputStream("C:/data/nothing.gif");
      var data = -1;
      while ((data = in.read()) != -1) {
        System.out.printf("%02X ", data);
      }
    } catch (FileNotFoundException e) {
      System.out.println("ファイルが見つかりませんでした。");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (in != null) {
          in.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
