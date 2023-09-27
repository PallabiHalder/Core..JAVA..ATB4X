package Sept.sept24.Interface;

public class interface006 {

    public static void main(String[] args) {


    }
}

interface A1 {

    int a = 30;

    void p1();


}


interface A2{


    int b = 50;

    void p2();
}


class H implements A1,A2{


    @Override
    public void p1() {

    }

    @Override
    public void p2() {

    }
}