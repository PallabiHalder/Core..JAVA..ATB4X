package Sept.sept17.Encapsulation.abc.criminal;

import Sept.sept17.Encapsulation.abc.police.Cop;

public class Theif {

    public static void main(String[] args) {


        Cop cop = new Cop(10);

       int g =  cop.gun ;

       int bullet = cop.getGun();

        System.out.println(bullet);

      //  cop.canIShoot(); // as protected, can't be accessed to different package



    }
}
