// Problem 3: Rotate the given array ‘a’ by k steps, where k is non-negative.

// Note: k can be greater than n as well.


// Input: a = [1,2,3,4,5,6,7], k = 3

// Output: [5,6,7,1,2,3,4]

public class RotateArray {

public static void rotate(int a[],int k){
    int n=a.length;
    k%=n;
    int[]ans=new int[n];
    for(int i = n-k; i <= n-1; i++) {       
         ans[i-(n-k)]=a[i];

    }
    for(int i = 0; i < n-k; i++) {

        ans[i+k] = a[i];
       
        }
       
        for(int i = 0; i < n; i++) {
       
        a[i] = ans[i];
       
        }
}


    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println("Original array ");
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
      }

       System.out.println("");
        int k=2;
        rotate(a,k);

        System.out.println("Rotated array ");

         for(int i=0;i<a.length;i++){

        System.out.print(a[i]+" ");

        }
    }
}
