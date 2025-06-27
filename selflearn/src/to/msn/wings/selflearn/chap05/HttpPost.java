package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpPost {

  public static void main(String[] args) throws IOException, InterruptedException {
    var client = HttpClient.newHttpClient();
    var req = HttpRequest.newBuilder()
      .uri(URI.create("https://www.web-deli.com/tmp/post.php"))
      .header("Content-Type","application/json")
      .POST(HttpRequest.BodyPublishers.ofString(
         "{ \"name\" : \"佐々木新之助\" }"))
      .build();
    var res = client.send(req, HttpResponse.BodyHandlers.ofString());
    System.out.println(res.body());
  }
}
