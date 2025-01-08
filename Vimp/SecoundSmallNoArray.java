/**
 * SecoundSmallNoArray 
 * int arr[] = {12, 13, 1, 10, 34, 11};
 * o/p  10

 */
public class SecoundSmallNoArray {
    public static void main(String[] args) {
        int arr[] = { 111, 13, 25, 9, 34, 1 };
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("smallest element is: " + smallest);

        int low1=Integer.MAX_VALUE;
        int low2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if (arr[i]<low1) {
                low2=low1;
                low1=arr[i];
            }else if (arr[i] <low2 && arr[i]!=low1) {
                low2=arr[i]   ;
            }


        }
       
        System.out.println("second smallest element is: "  + low2);

}
}