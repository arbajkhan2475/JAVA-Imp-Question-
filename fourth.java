
//  Q4). Sum Of All Natural Number (User Input)

import java.util.Scanner;

public class fourth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int a = sc.nextInt(); // 5

        int sum = 0; // Initial Stage Value

        for (int i = 1; i <= a; i++) { // 1 2 3 4 5

            sum = sum + i;
            /*
             * 
             * Step - 1 : Initial Stage Of sum 0+ i 1 = 1 sum=1
             * 
             * Step - 2 : sum 1+ i 2 = 3 sum = 3
             * 
             * Step - 3 : sum 3+ i 3 = 6 sum =6
             * 
             * Step - 4 : sum 6+ i 4 = 10 sum = 10
             * 
             * Final Result :
             * 
             * Step - 5 : sum 10 + i 5 = 15
             * 
             * 
             */
        }

        System.out.println("Sum Of Natural Number : " + sum);
    }

}
