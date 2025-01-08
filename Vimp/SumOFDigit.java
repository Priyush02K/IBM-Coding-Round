import java.util.Scanner;

public class SumOFDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sumOFDigit =0;
        int original_n=n;

        while (n>0) {
            sumOFDigit +=n % 10;
            n=n/10;
        }
        System.out.println("Sum12 of digit in "+ original_n +"=" +sumOFDigit);
    }
}
