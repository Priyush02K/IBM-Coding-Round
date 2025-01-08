import java.util.Scanner;

public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num,c=0,d,sq;

        System.out.println("Enter the number :");
        num=sc.nextInt();

        sq=num*num;
        int temp=num;

        while (temp >0) {
            d=temp %10;
            c++;
            temp=temp/10;
        }

        int last=(int)(sq %(Math.pow(10,c)));

        if (num ==last) {
            System.out.println("Automorphic No");
        }else{
            System.out.println(" Not Automorphic No");

        }
    }
}
