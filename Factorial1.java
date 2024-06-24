package DP1;

public class Factorial1 {

    // Method to calculate factorial using memoization
    public static int factM(int n) {
        int storage[] = new int[n + 1];
        return factM(n, storage);
    }

    // Helper method for memoization
    public static int factM(int n, int storage[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (storage[n] != 0) {
            return storage[n];
        }
        storage[n] = n * factM(n - 1, storage);
        return storage[n];
    }

    // Main method to test the factorial function
    public static void main(String[] args) {
        int n = 9;
        System.out.println(factM(n));
    }
}
