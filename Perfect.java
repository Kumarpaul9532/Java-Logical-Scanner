/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Perfect number or not.
   IDE        : VS Code             */

/* Sum of its proper divisor is equal to the number itself.  */

import java.util.Scanner;

public class Perfect {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, i = 2, s = 1;

        System.out.println("\nProgram for checking Perfect Number");
        System.out.print("Enter a number : ");
        n = in.nextInt();
        in.close();

        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                s += i;
                if (n / i != i)
                    s += n / i;
            }
        }
        if (s == n)
            System.out.println(n + " is a Perfect number");
        else
            System.out.println(n + " is not a Perfect number");
    }
}
