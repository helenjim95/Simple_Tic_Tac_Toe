import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int product = 0;
        int maxProduct = 0;

        if (length == 2) {
            product = array[0] * array[1];
            System.out.println(product);
        } else {
            for (int i = 1; i < length - 1; i++) {
                if (array[i - 1] > array[i + 1]) {
                    product = array[i - 1] * array[i];
                    if (product > maxProduct) {
                        maxProduct = product;
                    }
                } else {
                    product = array[i + 1] * array[i];
                    if (product > maxProduct) {
                        maxProduct = product;
                    }
                }
            }
            System.out.println(maxProduct);
        }
    }
}