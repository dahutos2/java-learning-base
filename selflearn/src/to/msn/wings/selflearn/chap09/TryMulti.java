package to.msn.wings.selflearn.chap09;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TryMulti {

  public static void main(String[] args) {
    try {
      var in = new FileInputStream("C:/data/nothing.gif");
      var data = -1;
      while ((data = in.read()) != -1) {
        System.out.printf("%02X ", data);
      }
      var uri = new URI( "https://www.wings.msn.to");
      System.out.println(uri.toString());
    } catch (IOException | URISyntaxException e) {
      System.out.println("ファイルにアクセスできません。");
      e.printStackTrace();
    }
  }
}