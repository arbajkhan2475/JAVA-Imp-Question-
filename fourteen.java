
// Q14).Identify the Greater Number.

import java.util.Scanner;

public class fourteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        if (a > b) {

            System.out.println(a + " is Greater.");
        }

        else {

            System.out.println(b + " is Greater.");
        }

    }

}
