/* Programmer : Paul Kumar
   Date       : 17/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Armstrong number or not.
   IDE        : VS Code             */

/*  If the number is having m digits then, the sum of the mth 
    Power of their digit is equal to the number itself.         */

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, x, c = 0, d, s = 0;

        System.out.println("\nProgram for checking Armstrong number");
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        x = n;
        while (x != 0) {
            c++;
            x /= 10;
        }
        x = n;
        while (x != 0) {
            d = x % 10;
            s += Math.pow(d, c);
            x /= 10;
        }
        
        if (s == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");

        sc.close();
    }
}
