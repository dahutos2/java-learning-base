package to.msn.wings.selflearn.chap07.optional2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class BookMap {
  private Map<String, String> data = new HashMap<>();

  public BookMap(Map<String, String> map) {
    this.data = map;
  }

  public Optional<String> getTitleByIsbn(String isbn) {
    return Optional.ofNullable(this.data.get(isbn));
  }
}
