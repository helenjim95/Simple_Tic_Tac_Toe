import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        double area = 0;
        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
                System.out.println(area);
                break;
            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                area = d * e;
                System.out.println(area);
                break;
            case "circle":
                double r = scanner.nextDouble();
                area = r * r * 3.14;
                System.out.println(area);
                break;
        }
    }
}