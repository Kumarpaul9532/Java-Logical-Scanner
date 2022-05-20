/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Abundant number or not.
   IDE        : VS Code             */

/* Sum of its proper divisor is greater than the number itself. */

import java.util.Scanner;

public class Abundant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i = 1, c = 0;

        System.out.println("\nProgram for checking Abundant numbers");
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();

        for (; i <= n / 2; i++) {
            if (n % i == 0)
                c+=i;
        }

        if (c > n)
            System.out.println(n + " is an Abundant Number");
        else
            System.out.println(n + " is not an Abundant Number");

    }
}
