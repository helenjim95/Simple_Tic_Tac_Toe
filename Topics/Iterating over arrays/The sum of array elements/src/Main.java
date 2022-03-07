import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int sum = 0;

        for (int number : array) {
            array[number] = scanner.nextInt();
            sum += array[number];
        }
        System.out.println(sum);
    }
}
