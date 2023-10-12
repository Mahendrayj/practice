import java.util.Scanner;

public class SquarePlots {
    public static int makeSquarePlots(int length, int breadth) {
        // Find the GCD of length and breadth
        int gcd = gcd(length, breadth);

        // Calculate the number of square plots that can be created
        int numSquarePlots = (length * breadth) / (gcd * gcd);

        return numSquarePlots;
    }

    // Function to calculate the Greatest Common Divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = scanner.nextInt();

        int numSquarePlots = makeSquarePlots(length, breadth);
        System.out.println("Number of square plots that can be created: " + numSquarePlots);
    }
}

