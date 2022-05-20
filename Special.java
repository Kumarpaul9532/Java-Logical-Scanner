/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Special number or not.
   IDE        : VS Code             */

/*   Sum of the factorial of its digit is equal to the number itself. 
     Special 2 digit number is the when sum of its digit is added 
     to the product of the digit.      */

import java.util.Scanner;

public class Special {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, c = 1, i, x, d, s = 0;

        System.out.println("\nProgram for checking Special Number");
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();

        x = n;
        while (x != 0) {
            d = x % 10;
            c = 1;
            for (i = d; i > 1; i--) {
                c *= i;
            }
            s += c;
            x /= 10;
        }
        if (s == n)
            System.out.println(n + " is a Special number");
        else
            System.out.println(n + " is not a Special number");
    }
}
