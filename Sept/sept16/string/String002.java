package Sept.sept16.string;

public class String002 {

    public static void main(String[] args) {


        // ** interview question **

        String str1 = "Hello";

        String str2 = "Guys";

        String str3 = "Hello Guys";

        String str4= str1.concat(str2);

        System.out.println(str3);

        System.out.println(str4);

        System.out.println(str3==str4); // false : reference will be never same after concatination.



    }
}
