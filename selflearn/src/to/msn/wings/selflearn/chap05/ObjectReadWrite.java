package to.msn.wings.selflearn.chap05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadWrite {

  public static void main(String[] args) {
    final var file = "C:/data/article.ser";
    try (var out = new ObjectOutputStream(new FileOutputStream(file))) {
      out.writeObject(new Article("Java11の変更点と新しいAPI",
        "https://codezine.jp/article/corner/751", false));
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (var in = new ObjectInputStream(new FileInputStream(file))) {
      var a = (Article)in.readObject();
      System.out.println(a);
    } catch (ClassNotFoundException | IOException e) {
      e.printStackTrace();
    }
  }
}
