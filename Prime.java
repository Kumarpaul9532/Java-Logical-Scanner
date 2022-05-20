/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Prime or not.
   IDE        : VS Code             */

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i = 2, d = 0;

        System.out.println("\nProgram for checking Prime Number");
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();

        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a Prime number");
                d = 1;
                break;

            }
        }
        if (d == 0)
            System.out.println(n + " is a Prime number");
    }
}
