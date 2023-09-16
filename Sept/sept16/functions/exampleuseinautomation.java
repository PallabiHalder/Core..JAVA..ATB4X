package Sept.sept16.functions;

public class exampleuseinautomation {

    public static void main(String[] args) {

       String s=  username();

        System.out.println(s);

        login();

       boolean output = login();

        System.out.println(output);


    }



    static boolean anotherFunction() {

       String output=  username();

       return true;
    }

    static boolean login(){

        if(username() =="Pallabi"){

            return true;
        }
        else {

            return false;
        }
    }

    static String username(){

        return "Pallabi";
    }



}
