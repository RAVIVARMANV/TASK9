package task9;

import java.util.Scanner;

public class qus3 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();       
        scanner.close();    
        printPattern(numRows);
    }
    private static void printPattern(int numRows)
    {
        int currentNumber = 1;       
        for (int i = 1; i <= numRows; i++) 
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println(); 
        }
    }
}