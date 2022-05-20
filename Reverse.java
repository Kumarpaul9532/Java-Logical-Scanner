/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and print the reverse of the number.
   IDE        : VS Code             */

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, x, s = 0, d;

        System.out.println("\nProgram for reversing a number");
        System.out.print("Enter a number : ");
        n = in.nextInt();

        x = n;
        while (x != 0) {
            d = x % 10;
            s = s * 10 + d;
            x /= 10;
        }
        System.out.printf("The reverse of %d is %d", n, s);

        in.close();
    }
}
