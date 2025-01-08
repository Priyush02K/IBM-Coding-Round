import java.util.Scanner;

/**
 * ToggleString
 */
public class ToggleString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre the string : ");

        String s=sc.nextLine();
        String s1=" ";   

        for(int i=0;i<s.length();i++){                    //tranvse
            char ch =s.charAt(i);   //strore
            if (Character.isUpperCase(ch)) {
                s1=s1+Character.toLowerCase(ch);  //convert
            }else{
                s1=s1+Character.toUpperCase(ch);
            }
        }
        System.out.println("Toggle string is : " + s1);
    }
    
}