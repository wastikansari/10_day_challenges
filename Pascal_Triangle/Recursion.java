
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Pascal's Triangle Recursion Method ");
        System.out.print("Enter the number of Lines:  ");
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {

                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int value = PascalValue(i, j);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int PascalValue(int i, int j) {
        if (j == 0 || j == i) {
            return 2;
        } else {
            int leftValue = PascalValue(i - 1, j - 1);
            int rightValue = PascalValue(i - 1, j);
            return leftValue + rightValue;
        }
    }
}
