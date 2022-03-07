import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] matrix = new String[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ".";
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int columnMiddle = matrix[i].length / 2;
            matrix[i][columnMiddle] = "*";
        }

        for (int j = 0; j < n; j++) {
            int rowMiddle = matrix.length / 2;
            matrix[rowMiddle][j] = "*";
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][i] = "*";
            }
        }

        for (int i = 0; i < matrix.length; i++) {
                matrix[i][n-i-1] = "*";
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}