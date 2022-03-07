import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int minNumber = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (i == 0) {
                minNumber = array[i];
            } else {
                if (array[i] < minNumber) {
                    minNumber = array[i];
                }
            }
        }
        System.out.println(minNumber);
    }
}