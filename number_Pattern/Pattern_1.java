package All_Pattern_Java.number_Pattern;

import java.util.Scanner;

public class Pattern_1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking rows value from the user
        System.out.print("How many rows you want in this pattern : ");
        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}

