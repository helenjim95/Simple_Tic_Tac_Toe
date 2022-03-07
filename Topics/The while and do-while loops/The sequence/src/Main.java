import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumberDivisibleByFour = 0;

        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input % 4 == 0 && input > maxNumberDivisibleByFour) {
                maxNumberDivisibleByFour = input;
            }
        }
        System.out.println(maxNumberDivisibleByFour);
    }
}