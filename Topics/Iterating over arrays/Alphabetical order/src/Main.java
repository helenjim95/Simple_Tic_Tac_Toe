import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        int count = 0;
        boolean inOrder = false;
        for (int j = 0; j < array.length-1; j++) {
            String a = array[j];
            String b = array[j+1];
            assert a != null;
            assert b != null;
            if (a.compareTo(b) <= 0) {
                count ++;
            }
        }
        if (count == array.length-1) {
            inOrder = true;
        }
        System.out.println(inOrder);
    }
}