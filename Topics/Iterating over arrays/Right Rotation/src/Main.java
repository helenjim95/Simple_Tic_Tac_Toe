import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int rotation = scanner.nextInt();
        rotation = rotation % array.length;

        for (int i = 0; i < rotation; i++) {
            rotate(array);
        }

        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

        //last index -> rotation index - 1
    public static String[] rotate (String[] array) {
        String temp = array[array.length - 1];
        for (int i = array.length-1; i >= 0; i--) {
            if (i == array.length - 1) {
                array[i] = array[i - 1];
            }
            if (i == 0) {
                array[i] = temp;
            } else {
                array[i] = array[i - 1];
            }
        }
        return array;
    }
}