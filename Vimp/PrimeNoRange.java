
/**
 * PrimeNoRange
 * Find the Prime Numbers in a Given Interval in Java
Given an integer input the objective is to check whether or not there are any Prime Numbers in the given interval or range. Therefore, we write a code to Find the Prime Numbers in a Given Interval in Java Language.

Example
Input : 2 10
Output : 2 3 5 7
 */


public class PrimeNoRange {

    public static boolean isPrime(int n){
        int count=0;
        if (n<2) {
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if (n % i==0) {
                return false;
            }
            
        }
        return true;
    }


    public static void main(String[] args) {
        int lower =1,upper=20;

        for(int i=0;i<=upper;i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}