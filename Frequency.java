/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and count the frequency of each digit.
   IDE        : VS Code             */

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, i = 0, c, d, x;

        System.out.println("\nProgram to count frequency of digits");
        System.out.print("Enter a number : ");
        n = in.nextInt();
        in.close();

        for (; i <= 9; i++) {
            x = n;
            c = 0;
            while (x != 0) {
                d = x % 10;
                if (d == i)
                    c++;
                x /= 10;
            }
            if (c != 0)
                System.out.printf("The frequency of %d in %d is %d\n", i, n, c);
        }

    }
}
