package Sept.sept17.Encapsulation.abc.police;

public class Cop2 {

   public static void main(String[] args) {

      Cop cop = new Cop(10);



      int g = cop.gun = 100;

      System.out.println(g);

      cop.canIShoot(); // can be accessed as cop and cop2 has same package.

   }









}
