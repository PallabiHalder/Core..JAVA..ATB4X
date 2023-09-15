package Sept.sept3.switchdemo;

public class Lab010 {

    public static void main(String[] args) {


        // Advanced Switch -> will found in jdk >13

        // Lamda Expression

        // switch with arrow(->) / without 'break'


        int item = 005;

        switch (item) {

            case (001) -> System.out.println(1);
            case (002) -> System.out.println(2);
            case (005) -> System.out.println(5);
            default-> System.out.println("default");
        }

    }
}
