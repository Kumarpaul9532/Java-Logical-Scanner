/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and print the factors of the number.
   IDE        : VS Code             */

import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i = 1;

        System.out.println("\nProgram for finding factor of a number");
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        System.out.println("The factors of " + n + " are : ");
        while (i <= n / 2) {
            if (n % i == 0)
                System.out.print(i + "\t");
            i++;
        }
        sc.close();
    }
}
