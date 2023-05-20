// Pascal's Triangle pattern in Java using the Memoization

import java.util.Scanner;

public class Memoization {
    public static void main(String[] args) {
        System.out.println("Pascal's Triangle Memoization Method");
        System.out.print("Enter the number of rows:  ");
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();

        int[][] triangle = new int[numRows][];
        PascalTriangle(triangle);

        for (int i = 0; i < numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {

                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void PascalTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = PascalValue(triangle, i, j);
            }
        }
    }

    public static int PascalValue(int[][] triangle, int row, int col) {
        if (triangle[row][col] != 0) {
            return triangle[row][col];
        } else {
            int leftValue = PascalValue(triangle, row - 1, col - 1);
            int rightValue = PascalValue(triangle, row - 1, col);
            triangle[row][col] = leftValue + rightValue;
            return triangle[row][col];
        }
    }
}
