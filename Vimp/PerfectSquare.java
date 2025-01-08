import java.util.Scanner;

/**
 * PerfectSquare
 */
public class PerfectSquare {

    public static boolean isPerfectSquare(int number) {
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square." );
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}