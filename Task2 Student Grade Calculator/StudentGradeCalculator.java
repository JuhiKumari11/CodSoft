package com.CodSoft.Task2;
import java.util.Scanner;
public class StudentGradeSystem {
		public static void main(String[] args) {	    
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Enter the number of subjects: ");
		      int numSubjects = sc.nextInt();
		      int[] marks = new int[numSubjects];
		      int totalMarks = 0;
		       for (int i = 0; i < numSubjects; i++) {
		           System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
		           marks[i] = sc.nextInt();
		           totalMarks += marks[i];
		        }
		        double averagePercentage = (double) totalMarks / numSubjects;
		        char grade = calculateGrade(averagePercentage);
		        System.out.println("\nResults:");
		        System.out.println("Total Marks: " + totalMarks);
		        System.out.println("Average Percentage: " + averagePercentage + "%");
		        System.out.println("Grade: " + grade);
		        sc.close();
		    }
		 public static char calculateGrade(double percentage) {
		      if (percentage >= 90) {
		            return 'A';
		       } else if (percentage >= 80) {
		        	return 'B';
		       } else if (percentage >= 70) {
		        	return 'C';
		       } else if (percentage >= 60) {
		        	return 'D';
		       } else if (percentage >= 50) {
		        	return 'E';
		       } else {
		        	return 'F';
		       }
		   }

	}
