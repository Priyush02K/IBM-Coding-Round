package PrepInsta;

import java.util.Scanner;

public class SumOfNatureNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=n) {
          sum+=i;  
          i++;
        }
        System.out.println("sum is :"+sum);
    }
}

//5 5+4+3+2+1 =15
