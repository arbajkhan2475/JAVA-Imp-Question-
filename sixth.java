
// Q6). Print All Odd Number Range

import java.util.Scanner;

public class sixth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();

        System.out.println("Odd Range : ");

        for (int i = 1; i <= a; i = i + 2) { // != - Does Not Equal to

            if (a % 2 != 0) {

                System.out.println(i);

            }

        }

    }

}
