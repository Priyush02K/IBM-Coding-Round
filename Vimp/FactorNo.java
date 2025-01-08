import java.util.Scanner;

public class FactorNo {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the no :");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();

        System.out.println("Factor of this given number :");

        for(int i=1;i<=number;i++){
            if (number % 
            i ==0) {
                System.out.print(i +" ");
            }
        }
    }
}
