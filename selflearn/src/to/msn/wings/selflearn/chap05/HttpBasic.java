package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpBasic {

  public static void main(String[] args) {
    try {
      var client = HttpClient.newHttpClient();
      var req = HttpRequest.newBuilder()
        .uri(URI.create("https://codezine.jp/"))
        .build();
      var res = client.send(req, HttpResponse.BodyHandlers.ofString());
      System.out.println(res.body());
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}
