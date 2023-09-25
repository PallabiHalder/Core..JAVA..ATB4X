package Sept.sept17.Encapsulation.abc.police;

public class Cop {

    public int gun ; // attribute


   public  Cop(int gun){  // parameterized constructor

        this.gun = gun ;

    }


    public int getGun() {  // method
        return gun;
    }


   protected   void canIShoot (){

        System.out.println("Yes you casn shoot");

    }
}

