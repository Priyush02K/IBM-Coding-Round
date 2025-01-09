import java.util.*;

public class DomiatingXorPairs {
    static int domiatingXorPairs(List<Integer> arr){
        int N=arr.size();
        int ans=0;
        int[]bits=new int[32];

        for(int i=0;i<N;i++){
            int val=(int )(Math.log(arr.get(i))/Math.log(2));
            ans+=bits[val];
            bits[val]++;
        }
        return N * (N-1)/2-ans;
    }
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(4,3,5,2);
        int result=domiatingXorPairs(arr);
        System.out.println(result);
    }
}
