package to.msn.wings.selflearn.chap05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite {

  public static void main(String[] args) {
    try (
        var in = new BufferedInputStream(
          new FileInputStream("C:/data/input.png"));
        var out = new BufferedOutputStream(
          new FileOutputStream("C:/data/output.png"))) {
      var data = -1;
      while ((data = in.read()) != -1) {
        out.write((byte) data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
