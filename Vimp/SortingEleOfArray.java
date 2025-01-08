// Input : arr[4] = [10, 40, 20, 30]
// Output : 10 20 30 40


public class SortingEleOfArray {
    public static void main(String[] args) {
        int arr[]=new int[] {10,40,30,20};
        int temp=0;

        //sort array --> 

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j])
                 {
                    //swap
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i]+ " ");
        }
    }
}
