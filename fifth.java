
// Q5). Even Or Odd.

import java.util.Scanner;

public class fifth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();

        if (a % 2 == 0) {

            System.out.println("Even");
        }

        else if (a == 1) {

            System.out.println("This Condition Is 1");
        }

        else {

            System.out.println("Odd");
        }

    }

}
