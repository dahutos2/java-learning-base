package to.msn.wings.selflearn.chap04.practice;

public class Practice4 {

  public static void main(String[] args) {
    var language = "Kotlin";

    switch (language) {
      case "Scala":
      case "Kotlin":
      case "Groovy":
        System.out.println("JVM言語");
        break;
      case "C#":
      case "Visual Basic":
      case "F#":
        System.out.println(".NET言語");
        break;
      default:
        System.out.println("不明");
        break;
    }
  }
}
