/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Pal Prime number  or not.
   IDE        : VS Code             */

/* 1. prime */

import java.util.Scanner;

public class PalPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, d = 0, s = 0, x, i = 2;

        System.out.println("\nProgram for PalPrime Number");
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();

        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " itself is not a Prime number");
                d = 1;
                break;

            }
        }
        if (d == 0) {
            x = n;
            while (x != 0) {
                d = x % 10;
                s = s * 10 + d;
                x /= 10;
            }
            if (s == n)
                System.out.println(n + " is a PalPrime number");
            else
                System.out.println(n + " is not a PalPrime number");
        }

    }
}
