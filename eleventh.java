
// Q11). Check Vowels or Not. (User-Input)

import java.util.Scanner;

public class eleventh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character : ");
        char a = sc.next().charAt(0);

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') {

            System.out.println("Vowels");
        }

        else {

            System.out.println("Consonent");
        }

    }

}
