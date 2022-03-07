import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 3
        int m = scanner.nextInt(); // 4
        int[][] input = new int[n][m]; //3 row 4 column
        int[][] output = new int[m][n]; // 4 row 3 column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                output[i][j] = input[j][i];
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}