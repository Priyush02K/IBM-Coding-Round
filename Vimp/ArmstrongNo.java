import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        
      int originalNum, digit,cubeSum =0,num;
      System.out.println("Enter the number :");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();

      originalNum=num;

      while (num !=0) {
        digit=num %10; //lasrt digit
        cubeSum +=  Math.pow(digit, 3);
        num=num/10;
      }

      if (cubeSum ==originalNum) {
        System.out.println(originalNum+ " is an Armstrong number");

      }
    else{
        System.out.println(originalNum+ " is not an Armstrong number");
    }

    }
}
