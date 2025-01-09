//Problem Statement – Given a sting , return the character that appears the minimum number of times in the string. The string will contain only ascii characters, from the ranges (“a”-”z”,”A”-”Z”,0-9), and case matters . If there is a tie in the minimum number of times a character appears in the string return the character that appears first in the string.

// Input Format:
// Single line with no space denoting the input string.

// OutputFormat:
// Single character denoting the least frequent character.

// Constraints:
// Length of string <=10^6

// Sample Input:
// cdadcda

// Sample Output:
// c

// Explanation:
// C and A both are with minimum frequency. So c is the answer because it comes first with less index.






import java.util.*;

class MinimumOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        int temp[] = new int[256];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 255; i >= 0; i--) {
            if (temp[i] == 0)
                continue;
            min = Math.min(min, temp[i]);
        }
    

        for (int i = 0; i < arr.length; i++) {
            if (min == temp[arr[i]]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}