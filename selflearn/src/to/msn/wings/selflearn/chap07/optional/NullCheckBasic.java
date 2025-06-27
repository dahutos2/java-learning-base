package to.msn.wings.selflearn.chap07.optional;

import java.util.Map;

public class NullCheckBasic {

  public static void main(String[] args) {
    var b = new BookMap(Map.of(
        "978-4-7981-5757-3", "JavaScript逆引きレシピ",
        "978-4-7981-5202-8", "Androidアプリ開発の教科書",
        "978-4-7981-5382-7", "独習C# 新版"
        ));

    var title = b.getTitleByIsbn("978-4-7981-5757-3");
    if (title == null) {
      System.out.println("書籍は存在しません。");
    } else {
      System.out.println(title.trim());
    }
  }
}
