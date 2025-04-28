
// Q8). Even and Odd Range (User - Input)

import java.util.Scanner;

public class eighth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();

        if (a % 2 == 0) {

            System.out.println("Even Number Range : ");
            for (int i = 0; i <= a; i = i + 2) {

                System.out.println(i);
            }
        }

        else {

            System.out.println("Odd Number Range : ");
            for (int i = 1; i <= a; i = i + 2) {

                System.out.println(i);
            }

        }

    }

}
