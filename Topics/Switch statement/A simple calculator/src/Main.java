import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();
        String operation = scanner.next();
        long secondNumber = scanner.nextLong();
        long result = 0;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println(result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println(result);
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println(result);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
