import java.util.Scanner;

public class PowerNo {
    public static void main(String[] args) {
        int num,pow,result=1;
        System.out.println("Enter the no :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        System.out.println("Enter the Power :");
        pow=sc.nextInt();

        for(int i=0; i<pow;i++){           
            result= num * result;
        }

        System.out.println("Power: " +result);



    }
}
