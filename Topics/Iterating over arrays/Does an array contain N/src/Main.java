import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            }
        int number = scanner.nextInt();
        boolean contain = false;
        for (int i = 0; i < length; i++) {
            if (array[i] == number) {
                contain = true;
            }
        }
        System.out.println(contain);


    }
}