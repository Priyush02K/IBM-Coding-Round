// For example  (unique no)
// Input− int arr[] = {1, 1, 2, 3, 3, 4, 4}
// Output − count is 4

import java.util.Arrays;

public class CountdistinctElemArray {
    
    public  static void countFreq(int arr[],int n){
        boolean vistied[]=new boolean[n];
        Arrays.fill(vistied,false);
        int count_dis=0;
        for(int i=0;i<n;i++){
            if (vistied[i]==true) {
                continue;
            }
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]) {
                    vistied[j]=true;
                }
            }
            count_dis = count_dis+1;

        }
        System.out.println(count_dis);

    }



    public static void main(String[] args) {
        int arr[]=new int[]{10, 30, 40, 20, 10, 20, 50, 10};;
        int n=arr.length;
        countFreq(arr, n);
   } 
}
