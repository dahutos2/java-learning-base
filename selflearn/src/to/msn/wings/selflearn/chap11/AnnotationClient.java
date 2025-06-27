package to.msn.wings.selflearn.chap11;

@ClassInfo(version = "2.1", description = "アノテーションの動作テスト")
// @ClassInfo("2.1")
public class AnnotationClient {
  public static void main(String[] args) throws ClassNotFoundException {
    var clazz = Class.forName("to.msn.wings.selflearn.chap11.AnnotationClient");
    var info = (ClassInfo) clazz.getAnnotation(ClassInfo.class);
    System.out.println("バージョン：" +
        (info.value().equals("") ? info.version() : info.value()));
    System.out.println("説明：" + info.description());
  }
}
