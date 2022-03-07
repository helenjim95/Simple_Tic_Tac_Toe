import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input == 0 || sum >=1000) {
                break;
            } else {
                sum += input;
            }
        }
        if (sum < 1000) {
            System.out.println(sum);
        } else {
            System.out.println(sum - 1000);
        }
    }
}