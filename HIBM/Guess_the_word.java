// Question 7 : Guess the word
// Problem Statement – Kochouseph Chittilappilly went to Dhruv Zplanet , a gaming space, with his friends and played a game called “Guess the Word”.
// Rules of games are –

// Computer displays some strings on the screen and the player should pick one string / word if this word matches with the random word that the computer picks then the player is declared as Winner.
// Kochouseph Chittilappilly’s friends played the game and no one won the game. This is Kochouseph Chittilappilly’s turn to play and he decided to must win the game.
// What he observed from his friend’s game is that the computer is picking up the string whose length is odd and also that should be maximum. Due to system failure computers sometimes cannot generate odd length words. In such cases you will lose the game anyways and it displays “better luck next time”. He needs your help. Check below cases for better understand
// Sample input :
// 5 → number of strings
// Hello Good morning Welcome you
// Sample output :
// morning

// Explanation:

// Hello → 5
// Good → 4
// Morning → 7
// Welcome → 7
// You → 3
// First word that is picked by computer is morning

// Sample input 2 :
// 3
// Go to hell

// Sample output 2:
// Better luck next time

// Explanation:
// Here no word with odd length so computer confuses and gives better luck next time


import java.util.*;
public class Guess_the_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of strings
        sc.nextLine(); // Consume the newline character after the integer input
        String arr[] = new String[n];

        // Read n strings into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        List<String> oddLength = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i].length() % 2 != 0) { // Check if the string length is odd
                oddLength.add(arr[i]);
            }
        }

        String res = ""; // To store the string with the maximum length
        int max = 0; // To track the maximum length
        for (String temp : oddLength) {
            if (temp.length() > max) { // Find the string with the maximum length
                res = temp;
                max = temp.length();
            }
        }

        System.out.println(res); // Print the result
        sc.close(); // Close the scanner
    }
}
