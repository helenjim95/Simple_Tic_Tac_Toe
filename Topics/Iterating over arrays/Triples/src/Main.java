import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < length-2; i++) {
            if (array[i] + 1 == array[i+1] && array[i+1] + 1 == array[i+2]) {
                count++;
            }
        }
        System.out.println(count);

    }
}