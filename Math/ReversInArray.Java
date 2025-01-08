public class ReversInArray{
   
    public static void reverse(int numbers[]){
        int first  =0, last=numbers.length-1;

        while(first < last){
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first]; 
            numbers[first]=temp;
            first++;
            last--;
        }
    }

    //bad approach
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        System.out.println("Original array ");

        for(int i=0;i<a.length;i++){

            System.out.print(a[i]+" ");
        }
        System.out.println("");
        int n=a.length;
        reverse(a,n);
        System.out.println("Reversed array ");
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
         }
        }
     }

    public static void main(String args[]) {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}