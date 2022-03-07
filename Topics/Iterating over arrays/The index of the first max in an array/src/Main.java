import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int maxIsIndex0 = 0;
        for (int i = 0; i < size; i++) {
            int maxNumber = array[0];
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                System.out.print(i);
                break;
            } else {
                maxIsIndex0 ++;
            }
        }

        if (maxIsIndex0 == size) {
            System.out.print(0);
        }

    }
}