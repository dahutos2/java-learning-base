package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamRead {

  public static void main(String[] args) {
    try (var reader = Files.newBufferedReader(
      Paths.get("C:\\data\\sample.txt"))) {
      var line = "";
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
