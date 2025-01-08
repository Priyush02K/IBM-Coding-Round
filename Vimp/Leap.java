package PrepInsta;

import java.util.Scanner;

/**
 * Leap
 * Check Whether or Not the Year is a Leap Year in Java
We will write Leap Year Program in Java. Given an integer input “year” the objective is to check if the given year is a leap year or not using the conditions for a leap year. Therefore, keeping them in mind we write a code to Check Whether or Not the Year is a Leap Year in Java Language.

Example
Input : 2024
Output: Leap Year
 */
public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year =sc.nextInt();
        if (year % 4==0 || (year % 4== 0 && year % 100 != 0)) {
            System.out.println (year + " is a Leap Year");

        }else{
            System.out.println (year + " is not a Leap Year");

        }

    }
    
}