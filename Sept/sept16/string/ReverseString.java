package Sept.sept16.string;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");

        StringBuilder sb;

        sb = new StringBuilder(sc.next());

        sb.reverse();

        System.out.println(sb);

    }
}
