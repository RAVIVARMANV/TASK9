package task9;

import java.util.Scanner;

public class qus1 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE WORD IS PALINDROME OR NOT :");
        String userInput = scanner.nextLine();
        scanner.close();

        if (Palindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }
    }

    static boolean Palindrome(String str) 
    {
        
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) 
        {
            
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }
        }      
        return true;
    }
}
