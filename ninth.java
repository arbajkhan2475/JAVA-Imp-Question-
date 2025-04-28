
// Q9). Sum Of Odd Even Number.

import java.util.Scanner;

public class ninth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt(); // 3

        int sum = 0;

        if (a % 2 == 0) {

            for (int i = 0; i <= a; i = i + 2) { // 8+6+4+2 = 20

                sum = sum + i;
            }
            System.out.println("Sum Of All Even Number : " + sum);
        }

        else {

            for (int i = 1; i <= a; i = i + 2) { // 3+1= 4

                sum = sum + i;
            }
            System.out.println("Sum Of All Odd Number : " + sum);

        }

    }

}
