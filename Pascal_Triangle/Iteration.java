// Pascal's Triangle pattern in Java using the iteration

import java.util.Scanner;
public class Iteration {
    public static void main(String[] args) {
        System.out.println("Pascal's Triangle Iteration Method ");
        System.out.print("Enter no of Rows : ");
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int number = 1;
        for (int i = 0; i < numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }

    }
}
