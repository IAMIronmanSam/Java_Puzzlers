package character_puzzlers;

public class Me {
   public static void main(String[] args) {
      System.out.println(
         Me.class.getName().replaceAll(".", "/") + ".class");
   }
}
