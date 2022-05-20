/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number in Octal Form as input from the user
                and convert it into Decimal Form.
   IDE        : VS Code             */

import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, x, s = 0, c = 1, d;

        System.out.println("\nProgram for conversion Octal to Decimal");
        System.out.print("Enter a number in Octal form : ");
        n = sc.nextInt();

        x = n;
        while (x != 0) {
            d = x % 10;
            s += c * d;
            c *= 8;
            x /= 10;
        }
        System.out.printf("The decimal of %d is %d", n, s);
        sc.close();
    }
}
