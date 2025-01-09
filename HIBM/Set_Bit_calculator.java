//Problem Statement – Angela plays with the different bits. She was given a bunch of numbers and she needs to find how many set bits are there in total. Help Angela to impress her, write a code to do so.

// Input Format:

// First line with n, an integer
// Next n lines denoting n integers angela is given.
// Output Format:

// Total number of set bits
// Constraints:

// Number of elements or number <=10^7
// numbers<=10000
// Sample Input:
// 4
// 1
// 3
// 2
// 1

// Sample Output:
// 5

import java.util.Scanner;

public class Set_Bit_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Number of integers
        int sum = 0;

        // Process each number
        while (n-- > 0) {
            int m = scanner.nextInt();
            sum += Integer.bitCount(m); // Count the number of set bits (1s) in the binary representation of m
        }

        // Output the total count of set bits
        System.out.println(sum);

        scanner.close();
    }
}
