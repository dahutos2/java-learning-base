package to.msn.wings.selflearn.chap07.optional;

import java.util.Map;

public class BookMap {
  private Map<String, String> data;

  public BookMap(Map<String, String> map) {
    this.data = map;
  }

  public String getTitleByIsbn(String isbn) {
    return this.data.get(isbn);
  }
}
