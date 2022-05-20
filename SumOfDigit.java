/* Programmer : Paul Kumar
   Date       : 18/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and print the sum of its digit.
   IDE        : VS Code             */

import java.util.Scanner;

public class SumOfDigit {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n,s=0,x,d;

        System.out.println("\nProgram for sum of digit");
        System.out.print("Enter a number : ");
        n=in.nextInt();

        x=n;
        while(x!=0){
            d=x%10;
            s+=d;
            x/=10;
        }
        System.out.printf("The sum of digits of %d is %d",n,s);
         in.close();
    }
}
