/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Duck number or not.
   IDE        : VS Code             */

/* If the number contains 0 , except in the beginning then
    the number is called  Duck number.    */

import java.util.Scanner;

public class Duck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, x, d, c = 0;

        System.out.println("\nProgram for checking Duck Number");
        System.out.print("Enter a number : ");
        n = in.nextInt();
       
        x = n;
        while (x != 0) {
            d = x % 10;
            if (d == 0) {
                c = 1;
                System.out.println(n + " is a Duck number");
                break;
            }
            x /= 10;
        }

        if (c == 0)
            System.out.println(n + " is not a Duck number");

        in.close();
    }
}