package task9;
import java.util.Scanner;
public class qus2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a word: ");
		String userInput = scanner.nextLine();
		scanner.close();
		String reversedString = reverseString(userInput);
		System.out.println("Reversed word: " + reversedString);
	}
	private static String reverseString(String input)
	{
		char[] charArray = input.toCharArray();
		int start = 0;
		int end = charArray.length - 1;
		while (start < end) 
		{
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		return new String(charArray);
	}
}
