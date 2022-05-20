/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Palindrome or not.
   IDE        : VS Code             */

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, d, s = 0, x;

        System.out.println("\nProgram for checking Palindrome number");
        System.out.print("Enter a number : ");
        n = in.nextInt();

        x = n;
        while (x != 0) {
            d = x % 10;
            s = s * 10 + d;
            x /= 10;
        }
        if (s == n)
            System.out.println(n + " is a Palindrome number");
        else
            System.out.println(n + " is not a Palindrome number");

        in.close();
    }
}
