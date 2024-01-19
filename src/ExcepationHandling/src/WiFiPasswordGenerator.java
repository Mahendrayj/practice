import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;

public class WiFiPasswordGenerator {

    public static void main(String[] args) {
        // Read input from STDIN
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.next();
        scanner.close();

        // Generate and print the valid arrangements
        List<String> result = generateValidPasswords(inputPassword);
        System.out.println(String.join(" ", result));
    }

    private static List<String> generateValidPasswords(String password) {
        List<String> validPerms = new ArrayList<>();
        Set<String> uniquePerms = new HashSet<>();  // Using HashSet to eliminate duplicates

        // Generate all permutations of the password
        permute("", password, uniquePerms);

        // Filter permutations based on the condition
        for (String perm : uniquePerms) {
            if (!Character.isDigit(perm.charAt(0))) {
                validPerms.add(perm);
            }
        }

        // Sort the valid permutations in the specified order
        Collections.sort(validPerms);

        return validPerms;
    }

    private static void permute(String prefix, String remaining, Set<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                if (i > 0 && remaining.charAt(i) == remaining.charAt(i - 1)) {
                    continue; // Skip duplicate characters to avoid duplicate permutations
                }
                permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), result);
            }
        }
    }
}
