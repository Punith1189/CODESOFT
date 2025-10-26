package StudentGradeClaculator.com;

import java.util.Scanner;

public class StudentGrade 
{
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        double totalMarks = 0;

	        for (int i = 1; i <= numSubjects; i++) {
	            System.out.print("Enter marks for subject " + i + " (out of 100): ");
	            double marks = scanner.nextDouble();
	            totalMarks += marks;
	        }

	        double average = totalMarks / numSubjects;

	        char grade;
	        if (average >= 90) {
	            grade = 'A';
	        } else if (average >= 80) {
	            grade = 'B';
	        } else if (average >= 70) {
	            grade = 'C';
	        } else if (average >= 60) {
	            grade = 'D';
	        } else if (average >= 50) {
	            grade = 'E';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("\n----- Result -----");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + average + "%");
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }
	}
