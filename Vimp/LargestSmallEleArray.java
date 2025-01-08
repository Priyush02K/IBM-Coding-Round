public class LargestSmallEleArray {
    public static void main(String[] args) {
        int  arr[]={12, 13, 1, 10, 34, 10};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (max< arr[i]) {
                max=arr[i];
            }
            if (min > arr[i]) {
                min=arr[i];
            }
        }
        System.out.println("Find Largest element in an array :" +max);
        System.out.println("Find Smallest Element in an Array :" +min);
    }
}
