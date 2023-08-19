
import java.util.Scanner;

public class ExponentiationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculateExponentiation(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    private static double calculateExponentiation(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1 / calculateExponentiation(base, -exponent);
        } else {
            double halfPower = calculateExponentiation(base, exponent / 2);
            if (exponent % 2 == 0) {
                return halfPower * halfPower;
            } else {
                return base * halfPower * halfPower;
            }
        }
    }
}

