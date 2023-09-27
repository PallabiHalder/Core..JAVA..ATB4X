package Sept.sept24.Interface;

public class interface002 {

    public static void main(String[] args) {



    }
}



interface PQ {  // interface



    int d= 20; // by default it is final and static variable.

    void p(); // by default it is public and abstract.
}




abstract class AB{  // abstract class

    abstract void a();


}

abstract class CD implements PQ { // another abstract class

    int f = 50;

}



class EF extends CD{  // concrete class


    @Override
    public void p() {

    }
}