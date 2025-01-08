// **
//  * SumOfArrayElem
//  * 
//  * Calculate the sum of all the elements in the given array.
// Input : arr[l, 5,  3}
// Output : 9
//  */

public class SumofEleArray {
    public static void main(String[] args) {
        int [] arr={1,4,5,6,1} ;
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
        }  
          System.out.println(sum);
 
     }
}
