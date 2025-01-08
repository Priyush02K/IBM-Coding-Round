package PrepInsta;

import java.util.Scanner;

/**
 * SumofNoRange
 * 
 *s Find the Sum of the Numbers in a Given Range in Java
Given two integer inputs number1 and number2, the objective is to find the sum of all Number that lay in the given interval by writing a code to Find the Sum of the Numbers in a Given Range in Java Language.

Example
Input : Number1 = 12 , Number2 = 15
Output : 54
 */
public class SumofNoRange {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the first No (range)");
        int start=sc.nextInt();

        System.out.println("Entre the end No (range)");
        int end=sc.nextInt();

        int sum=0;

        while (start<=end) {
            sum=sum+start;
            start++;
        }

        System.out.println("Sum of the Numbers in a Given Range " +sum);

    }

    
}