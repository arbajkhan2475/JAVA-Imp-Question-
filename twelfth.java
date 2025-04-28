
// Q12). Print ASCII Value.

import java.util.Scanner;

public class twelfth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Charcter : ");
        char a = sc.next().charAt(0);

        System.out.println("ASCII VALUE " + a + " : " + (int) a); // Typecasting - Datatype Converting

    }

}
