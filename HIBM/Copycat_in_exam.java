//Problem Statement – Rahul copies in the exam from his adjacent students. But he doesn’t want to be caught, so he changes words keeping the letter constant. That means he interchanges the positions of letters in words. You are the examiner and you have to find if he has copied a certain word from the one adjacent student who is giving the same exam, and give Rahul the markings he deserves.

// Note that: Uppercase and lowercase are the  same.

// Input Format:

// First line with the adjacent student’s word
// Second line with Rahul’s word
// Output Format:

// 0 if not copied
// 1 if copied
// Constraints:

// 1<=Length of string<=10^6
// Sample Input:

// CAR

// Acr

// Sample Output:

// 1

import java.util.Arrays;
import java.util.Scanner;

public class Copycat_in_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr2);
        String res1 = new String(arr1);
        String res2 = new String(arr2);
        if (res1.equals(res2))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
