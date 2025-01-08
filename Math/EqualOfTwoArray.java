
// 2 5 7 9 11
// 2 5 7 9 13
// Output:
// false

import java.util.Scanner;

public class EqualOfTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[n];
        
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        boolean ans=true;

        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
            if (arr2[i]!=arr1[i]) {
                ans= false;
                break;

            }
        }
        System.out.print(ans);
    }
}
