import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        int percentage = scanner.nextInt();
        int goal = scanner.nextInt();
        int year = 0;
        double earning = deposit;

        while (earning < goal) {
            earning += earning * percentage / 100;
            year++;
        }
        System.out.println(year);
    }
}