import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        boolean crash = false;

        for (int i = 0; i < numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + (i+1));
                crash = true;
                break;
            }
        }
        if (!crash) {
            System.out.println("Will not crash");
        }
    }
}