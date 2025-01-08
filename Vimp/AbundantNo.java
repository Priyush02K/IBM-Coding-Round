import java.util.Scanner;

public class AbundantNo {
    public static void main(String[] args) {
       System.out.println("Entre the number");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int total =n;
       int sum=0;

       for(int i=1;i<n;i++){
        if (n%i==0) {
            sum=sum+i;
        }     
       }
       if (sum<total) {
        System.out.println("Deficient number " +total);
       }

       if (sum>total) {
        System.out.println("Abundant number " +total);
       }
    }
}
