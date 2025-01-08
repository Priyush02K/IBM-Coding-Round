package PrepInsta;
// Find the Greatest of the Two Numbers in Java
// Given two integer inputs N1 and N2, the objective is to write a code to Find the Greatest of the Two Numbers in Java. In order to do so we’ll compare the numbers using if-else statements.
 
// Example
// Input : num1 = 12 and num2 = 3
// Output : 12
public class GreatestNo {
    public static void main(String[] args) {
        int num1=50,num2=20;
        if (num1 == num2) 
            System.out.println("Both are Equal");
            else if (num1 > num2) {
                System.out.println (num1 + " is greater");

            }else{
                System.out.println (num2 + " is greater");

            }
        
    }
}
