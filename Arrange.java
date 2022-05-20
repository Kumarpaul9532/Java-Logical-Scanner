/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and print the number in ascending order.
   IDE        : VS Code             */

import java.util.Scanner;

public class Arrange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, i = 0, x, d;

        System.out.println("\nProgram for arranging the digits");
        System.out.print("Enter a number : ");
        n = in.nextInt();
        in.close();

        System.out.print("Number in arranged order : ");
        for (; i <= 9; i++) {
            x = n;
            while (x != 0) {
                d = x % 10;
                if (d == i)
                    System.out.print(i);
                x /= 10;
            }
        }
    }
}
