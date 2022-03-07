import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int sqrt = 1;

        while (sqrt <= number) {
            System.out.println(sqrt);
            i++;
            sqrt = i * i;
        }
    }

}