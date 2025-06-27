package to.msn.wings.selflearn.chap07.optional2;

import java.util.HashMap;

public class OptionalNullCheck {

  public static void main(String[] args) {
    var b = new BookMap(
      new HashMap<String, String>() {
        {
          put("978-4-7981-5757-3", "JavaScript逆引きレシピ");
          put("978-4-7981-5202-8", "Androidアプリ開発の教科書");
          put("978-4-7981-5382-7", "独習C# 新版");
        }
      });

    var optTitle = b.getTitleByIsbn("978-4-7981-5757-3");
    var title = optTitle.orElse("×");
    System.out.println(title.trim());
  }
}
