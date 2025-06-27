package to.msn.wings.selflearn.chap09;

public class TryBad {

  public static void main(String[] args) {
    var data = new String[] { "Java", "C#", "Python" };
    try {
      var i = 0;
      while (true) {
        System.out.println(data[i++]);
      }
    } catch (ArrayIndexOutOfBoundsException e) { }
  }
}
