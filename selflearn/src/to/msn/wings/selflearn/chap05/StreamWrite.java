package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class StreamWrite {

  public static void main(String[] args) {
    try (var writer = Files.newBufferedWriter(Paths.get("C:\\data\\data.log"))) {
    // try (var writer = Files.newBufferedWriter(Paths.get("C:/data/data.log"))) {
    //try (var writer = Files.newBufferedWriter(Paths.get("C:\\data\\data.log"), StandardOpenOption.APPEND)) {
    writer.write(LocalDateTime.now().toString());
      writer.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
