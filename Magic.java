/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Magic number or not.
   IDE        : VS Code             */

/*  Sum of its digit is calculated till a single digit, and it should be equal to 1. */

import java.util.Scanner;

public class Magic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, s = 0, d, x;

        System.out.println("\nProgram for cheching Magic Number");
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();

        x = n;
        for (;;) {
            s = 0;
            while (x != 0) {
                d = x % 10;
                s += d;
                x /= 10;
            }
            if (s > 9)
                x = s;
            else
                break;
        }
        if (s == 1)
            System.out.println(n + " is a Magic number");
        else
            System.out.println(n + " is not a Magic number");
    }
}
