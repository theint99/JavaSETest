package with_ide;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int a = new Scanner(System.in).nextInt();

        int fact =1;

        for (int i = 1; i <= a ; i++) {
            fact = fact *i;
        }
        System.out.println("Factorial of your input number is " + fact);
    }
}
