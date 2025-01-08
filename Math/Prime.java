public class Prime {

//    public static boolean isPrime(int n){
//     boolean   isPrime=true;
//        for (int i=2;i<n-1;i++){
//            if (n % i == 0){
//                return false;
//            }
//        }return  true;
//    }

    //optimize way implemention
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2; i<= Math.sqrt(n);i++){
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }

    // to print all range in prime ex n=10 2,3,5,7
    public static void primeInRange(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //System.out.println(isPrime(16));
        primeInRange(20);
    }
}