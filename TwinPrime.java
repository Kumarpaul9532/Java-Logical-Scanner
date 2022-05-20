/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept two numbers as input from the user
                and check whether the numbers are twin prime or not.
   IDE        : VS Code             */

import java.util.Scanner;

public class TwinPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, m, i = 2, d = 0;

        System.out.println("\nProgram for checking Twin Prime");
        System.out.print("Enter two numbers : ");
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();

        if (n % 2 == 0 || m % 2 == 0)
            System.out.printf("%d and %d are not Twin Prime", n, m);
        else if (Math.abs(n - m) != 2)
            System.out.printf("%d and %d are not Twin Prime", n, m);
        else {
            for (; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.printf("%d and %d are not Twin Prime", n, m);
                    d = 1;
                    break;

                }
            }
            if (d == 0) {
                for (i = 2; i <= Math.sqrt(m); i++) {
                    if (m % i == 0) {
                        System.out.printf("%d and %d are not Twin Prime", n, m);
                        d = 1;
                        break;

                    }
                }
                if (d == 0)
                    System.out.printf("%d and %d are Twin Prime", n, m);
            }
        }
    }
}
