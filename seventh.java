
// Q7). Even Number Range Program

import java.util.Scanner;

public class seventh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();

        System.out.println("Even Range : ");

        for (int i = 0; i <= a; i = i + 2) { //

            if (a % 2 == 0) {

                System.out.println(i);

            }

        }

    }

}
