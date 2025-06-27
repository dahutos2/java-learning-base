package to.msn.wings.selflearn.chap05.practice;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Practice3 {

  public static void main(String[] args) {
    try (var writer = Files.newBufferedWriter(
      Paths.get("C:/data/data.dat"), Charset.forName("Windows-31J"),
      StandardOpenOption.APPEND)) {
      writer.write(String.join(",", args));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
