package Sept.sept3.switchdemo;

public class Lab009 {

    public static void main(String[] args) {


        // in jdk 11 introduced new feature as switch and yield. (Can  return value)

        // yield is a keyword.


        String code = "w";

        String msg = switch (code){
            case "w":
                System.out.println("Hi");

                yield "Yes";

            default:
                System.out.println("Bye");

                yield "Default";
        };
        System.out.println(msg);
    }
}
