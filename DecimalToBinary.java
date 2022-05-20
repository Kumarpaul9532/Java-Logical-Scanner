/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number in Decimal Form as input from the user
                and convert it into Binary Form.
   IDE        : VS Code             */

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int d, bin = 0, n, b = 1, x;

        System.out.println("\nProgram for conversion Decimal to Binary");
        System.out.print("Enter a number : ");
        n = in.nextInt();

        x = n;
        while (x != 0) {
            d = x % 2;
            bin += d * b;
            x /= 2;
            b *= 10;
        }

        System.out.printf("The binary of %d is %d", n, bin);

        in.close();
    }
}
