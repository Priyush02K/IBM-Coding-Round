// Problem Statement – The principal has a problem with repetitions. 
//Everytime someone sends the same email twice he becomes angry and starts yelling. 
//His personal assistant filters the mails so that all the unique mails are sent only once, and if there is someone sending the same mail again and again, he deletes them. 
//Write a program which will see the list of roll numbers of the student and find how many emails are to be deleted.

// Sample Input:
// 6
// 1
// 3
// 3
// 4
// 3
// 3

// Sample Output:
// 3

import java.util.HashMap;
import java.util.Scanner;

public class Duplicates {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        // Input the number of elements
        int n = scanner.nextInt();

        // Process each element
        while (n-- > 0) {
            int a = scanner.nextInt();

            // Check if the element is not already in the map
            if (!map.containsKey(a)) {
                map.put(a, 1); // Add the element to the map
                ans++;         // Increment the unique element count
            }
        }

        // Print the count of unique elements
        System.out.println(ans);
        scanner.close();
    }
}