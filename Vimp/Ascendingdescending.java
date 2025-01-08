import java.util.Arrays;

/**
 * Sort First half in Ascending and Second half in descending order in Java
 * Input : arr[6] = [1, 90, 34, 89, 7, 9]
   Output : 1 7 9 90 89 34
 * Ascendingdescending 
 */
public class Ascendingdescending  {
   


    static void ascdec(int []arr, int n){

        int  temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n/2;j++){
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            for(int j=n/2;j<n-1;j++){
                if (arr[j]<arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            
        }
    //            Arrays.sort(arr);

    //   // printing first half in ascending order
    //   for (int i = 0; i < n / 2; i++) 
    //   { 
    //     System.out.print(arr[i] + " "); 
    //   } 
    //  // printing second half in descending order 
    //   for (int j = n - 1; j >= n / 2; j--)
    //   {
    //      System.out.print(arr[j] + " ");
    //   }

            for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

public static void main(String[] args) {
      int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
      int n = arr.length;
      ascdec(arr, n);

    }
    
}