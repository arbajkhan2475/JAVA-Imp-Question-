// Q16). Normal Method Of Factorial.

import java.util.Scanner;

public class sixteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt(); // 5

        int fact = 1; // Initial Stage

        for (int i = 1; i <= a; i++) { // 5*4*3*2*1 = 120

            fact = fact * i;

            /*
             * Step - 1 : 1*1 = fact 1
             * 
             * Step - 2 : 1*2 = fact 2
             * 
             * Step - 3 : 2*3 = fact 6
             * 
             * Step - 4 : 6*4 = fact 24
             * 
             * Final Result :
             * Step - 5 : 24*5 = fact 120
             */
        }

        System.out.println("Factorial : " + fact);
    }

}