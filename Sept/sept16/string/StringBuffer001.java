package Sept.sept16.string;

public class StringBuffer001 {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("TTA");

        StringBuffer sb2 = new StringBuffer("TTA");

        System.out.println(sb1==sb2); // false as reference is different

        System.out.println(sb1.equals(sb2)); // belongs to object class //false : as check for reference here.

        System.out.println(sb1.toString().contentEquals(sb2.toString())); //true :

                                                        // It checks the actual value in String buffer.
    }
}
