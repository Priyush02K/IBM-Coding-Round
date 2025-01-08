import java.util.*;

/**
 * frequencyOfeleArray
 * 
 arr= {10, 30, 10, 20, 10, 20, 30, 10};
    10 occurs 4 times
    30 occurs 2 times
    20 occurs 2 times
 */
public class frequencyOfeleArray {
    public static void countFreq(int arr[],int n){
        boolean visited[]=new boolean[n];
        Arrays.fill( visited,false);

        //traveling 
        for(int i=0;i<n;i++){
            if (visited[i]==true) {
                continue;
            }
            //count
            int count =1;
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]) {
                   visited[j]=true; 
                   count++;

                }
            }
            System.out.println(arr[i] + " occurs " + count +" times ");   
        }

    }

    //optimal approach


    static void countFreqotml(int arr[], int n)
    {
       Map<Integer, Integer> mp = new HashMap<>();
 
       // Traverse through array elements and
       // count frequencies
       for (int i = 0; i < n; i++)
       {
          if (mp.containsKey(arr[i]))
          {
            mp.put(arr[i], mp.get(arr[i]) + 1);
          }
          else
          {
            mp.put(arr[i], 1);
          }
      }
      // Traverse through map and print frequencies
      for (Map.Entry<Integer, Integer> entry : mp.entrySet())
      {
           System.out.println(entry.getKey() + " occurs " + entry.getValue()+" times ");
      }
   }
  
    



    public static void main(String[] args) {
        int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        countFreq(arr, n);
        countFreqotml(arr,n);
    }
}