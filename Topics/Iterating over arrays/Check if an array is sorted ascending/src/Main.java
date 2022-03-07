import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean inOrder = true;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                inOrder = false;
            }
        }
        System.out.println(inOrder);
    }
}