import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income for the financial year 2021-2022: ");
        double income = scanner.nextDouble();

        double taxAmount = calculateIncomeTax(income);
        System.out.println("Income tax payable for the financial year 2021-2022: " + taxAmount);
    }

    private static double calculateIncomeTax(double income) {
        double taxAmount = 0.0;

        if (income <= 250000) {
            taxAmount = 0;
        } else if (income <= 500000) {
            taxAmount = 0.05 * (income - 250000);
        } else if (income <= 1000000) {
            taxAmount = 0.20 * (income - 500000) + 25000;
        } else {
            taxAmount = 0.30 * (income - 1000000) + 125000;
        }

        return taxAmount;
    }
}

