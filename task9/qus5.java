package task9;

import java.util.Scanner;

public class qus5 {
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();
        
        String result = calculateGrade(marks);
        System.out.println(result);
    }

    public static String calculateGrade(int marks) {
        if (marks > 100) {
            return "Invalid Input";
        } else if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
}