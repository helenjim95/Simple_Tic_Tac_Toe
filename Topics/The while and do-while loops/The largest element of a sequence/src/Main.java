import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int maxNumber = 0;

        while ((input != 0)) {
            if (input > maxNumber) {
                maxNumber = input;
            }
            input = scanner.nextInt();
        }
        System.out.println(maxNumber);
    }
}