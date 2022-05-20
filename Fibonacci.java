/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to print the first n terms of Fibonacci series.
                0 , 1 , 1 , 2 , 3 , 5 ..... n
   IDE        : VS Code             */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, a = -1, b = 1, c = 0, i = 1;

        System.out.println("\nProgram to find the first n terms of Fibonacci series");
        System.out.print("Enter the number of terms : ");
        n = in.nextInt();
        in.close();

        for (; i <= n; i++) {
            c = a + b;
            System.out.print(c);
            a = b;
            b = c;
            if (i < n)
                System.out.print(", ");
        }
        System.out.println(".");

    }
}
