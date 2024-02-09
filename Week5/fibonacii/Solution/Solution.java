package org.example;

// Import your library
// Do not change the name of the Solution class
public class Solution {

    public static long fibonacci(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
