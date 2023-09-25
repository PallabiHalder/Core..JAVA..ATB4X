package Sept.sept16.string;

public class String003 {

    public static void main(String[] args) {


        String str1 = "TTA";

        String str2 = "TTA";

        String str3 = "TTa";

        System.out.println(str1.equals(str2));

        System.out.println(str3.equals(str2));

        System.out.println(str3.equalsIgnoreCase(str2));


        System.out.println(str1.compareTo(str2)); // if equal,returns '0'.

        System.out.println(str2.compareTo(str3)); // compare ASCII value

        System.out.println(str3.compareTo(str2));  //  compare ASCII value

        System.out.println(str2.compareToIgnoreCase(str3));  // compare ASCII value
    }
}
