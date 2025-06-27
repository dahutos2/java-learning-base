package to.msn.wings.selflearn.chap04.practice;

public class Practice5 {

  public static void main(String[] args) {
    var language = "Kotlin";
    if (language.equals("Scala") || language.equals("Kotlin") || language.equals("Groovy")) {
      System.out.println("JVM言語");
    } else if (language.equals("C#") || language.equals("Visual Basic") || language.equals("F#")) {
      System.out.println(".NET言語");
    } else {
      System.out.println("不明");
    }
  }
}
