import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long i = 1;
        long sum = 1;
        do {
            sum *= i;
            i++;
        } while (sum <= input);

        System.out.println(i-1);
    }
}