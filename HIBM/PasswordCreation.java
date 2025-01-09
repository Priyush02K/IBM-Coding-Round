// Question 25: jumble the words
// Solve the given equations:

// Confuse your friends by jumbling the two words given to you. To don’t get yourself into confusion follow a pattern to jumble the letters.
// Pattern to be followed is , pick a character from the first word and pick another character from the second word.
// Continue this process

// Take two strings as input , create a new string by picking a letter from string1 and then from string2, repeat this until both strings are finished and maintain the subsequence. If one of the strings is exhausted before the other, append the remaining letters from the other string all at once.
// EX:
    // str1=priyush
    // str=khobragade

    //o/p= "pkrhioybursahgade"


import java.util.*;
public class PasswordCreation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String str1 = sc.next();
        String str2  = sc.next();
        String password=" ";
        int i, j;

        for( i=0,j=0; i<str1.length() && j<str2.length();i++,j++ ){
            password=password+str1.charAt(i) +str2.charAt(j);
        }
        if (i<str1.length()) 
            password=password+str1.substring(i,str1.length());
 
        
        if(j<str2.length())
        password=password+str2.substring(j,str2.length());
            System.out.println(password);




    
    }
}