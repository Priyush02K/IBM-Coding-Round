import java.util.Scanner;

/**
 * HarshadNo
 */
public class HarshadNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int n  = sc.nextInt();
		int n1 = n;
		int sum = 0;
		while(n1!=0)
		{
			int rem  = n1%10;
			sum  = sum + rem;
			n1 = n1/10;
		}
		if(n%sum==0)
		{
			System.out.println(n+" is a harshad number");
		}
		else
		{
			System.out.println(n+" is not a harshad number");
		}
    }
}