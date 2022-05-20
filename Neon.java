/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Neon number or not.
   IDE        : VS Code             */

/* Sum of its digit of the sqaure of the number is equal to the number.  */

import java.util.Scanner;

public class Neon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, x, s = 0, d;

        System.out.println("\nProgram for checking Neon Number");
        System.out.print("Enter a number : ");
        n = in.nextInt();
        in.close();

        x = n * n;
        while (x != 0) {
            d = x % 10;
            s += d;
            x /= 10;
        }
        if (s == n)
            System.out.println(n + " is a Neon Number");
        else
            System.out.println(n + " is not a Neon Number");
    }
}
