import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompany = scanner.nextInt();
        int[] incomeList = new int[numberOfCompany];
        double[] taxPercentageList = new double[numberOfCompany];
        double[] taxList = new double[numberOfCompany];
        for (int i = 0; i < numberOfCompany; i++) {
            incomeList[i] = scanner.nextInt();
        }
        for (int i = 0; i < numberOfCompany; i++) {
            taxPercentageList[i] = scanner.nextInt();
        }
        for (int i = 0; i < numberOfCompany; i++) {
            taxList[i] = incomeList[i] * taxPercentageList[i] / 100;
        }
        double highestTax = 0;
        int companyWithHighestTax = 1;
        for (int i = 0; i < numberOfCompany; i++) {
            if (taxList[i] > highestTax) {
                highestTax = taxList[i];
                companyWithHighestTax = i+1;
            }
        }
        System.out.println(companyWithHighestTax);
    }
}