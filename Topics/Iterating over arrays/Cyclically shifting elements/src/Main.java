import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int temp = 0;
        if (length != 1) {
            for (int i = length - 1; i >= 0; i--) {
                if (i == length - 1) {
                    temp = array[i];
                    array[i] = array[i - 1];
                } else if (i == 0) {
                    array[i] = temp;
                } else {
                    array[i] = array[i - 1];
                }
            }
        }

        System.out.print(array[0]);
        for (int i = 1; i < length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}