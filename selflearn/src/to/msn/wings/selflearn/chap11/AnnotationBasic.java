package to.msn.wings.selflearn.chap11;

public class AnnotationBasic {

  public static Integer process() {
   //@SuppressWarnings("deprecation")
    var i = new Integer(108);
   return i;
  }

  public static void main(String[] args) {
    System.out.println(process());
  }
}
