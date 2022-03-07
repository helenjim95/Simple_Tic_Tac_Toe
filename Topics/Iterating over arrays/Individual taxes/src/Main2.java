import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] countList = new int[size];

        int k = 0;
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            array[k] = input;
            k++;
        }
        if (size == 1) {
            System.out.println(1);
        } else {
            int count = 0;
            for (int i = 0; i < size-1; i++) {
                int j = 0;
                while (array[j] < array[j + 1]) {
                    count++;
                    j++;
                }
                countList[i] = count;
            }
            int maxCount = 0;
            for (int i = 0; i < countList[countList.length-1]; i++) {
                if (countList[i] > maxCount) {
                    maxCount = countList[i];
                }
            }
            System.out.println(maxCount);
        }
    }
}
