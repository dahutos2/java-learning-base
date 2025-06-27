package to.msn.wings.selflearn.chap09;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UseTrans {
  public void readHttpPages() throws MySampleException {
    try (var reader = Files.newBufferedReader(Paths.get("C:/data/link.txt"))) {
      var line = "";
      while ((line = reader.readLine()) != null) {
        var client = HttpClient.newHttpClient();
        var req = HttpRequest.newBuilder().uri(URI.create(line)).build();
        var res = client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println(res.body());
      }
    } catch (IOException | InterruptedException e) {
      throw new MySampleException(e);
    }
  }
}
