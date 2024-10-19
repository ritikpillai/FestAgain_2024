import java.util.*;

public class SqRootPrecision {
    public static void main(String[] args) {
        int n = 40; // Number to find the square root of
        int p = 3; // Precision of the square root

        // Printing the square root up to the specified precision
        System.out.printf("%.3f", sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;

        // Binary search for the integer part of the square root
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (m * m == n) {
                return m;
            }
            if (m * m > n) {
                end = m - 1;
            } else {
                start = m + 1;
            }
        }

        // Precision adjustment for the fractional part of the square root
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment;
            increment /= 10; // Reduce the increment for more precision
        }

        return root;
    }
}