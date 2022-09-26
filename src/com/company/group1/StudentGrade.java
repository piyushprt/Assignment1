package com.company.group1;

import java.util.Scanner;

public class StudentGrade {
	static Student[] students = new Student[2];
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter register no: ");
			String regNo = scn.next();
			
			System.out.println("Enter no of courses: ");
			int noOfCourses = scn.nextInt();
			
			System.out.println("Enter marks in " + noOfCourses + " subjects: ");
			float[] marks = new float[noOfCourses];
			
			for(int j=0;j<marks.length;j++) {
				marks[j] = scn.nextFloat();
			}
			
			Student student = new Student(regNo, noOfCourses, marks);
			students[i] = student;
		}
		System.out.println("Enter registation number to access the gradeCard: ");
		String regNo = scn.next();
		determineGrade(regNo, getStudentMarks(regNo));
	}
	
	static void determineGrade(String regNo,float[] marks) {
		for (int i = 0; i < students.length; i++) {
			if(students[i].regNo.equals(regNo)) {
				System.out.println("Grades of student with regNo " + regNo + " are: ");
				int sCount = 0;
				for (int j = 0; j < marks.length; j++) {
					if(marks[j] >= 90.0f && marks[j] <= 100.0f) {
						System.out.println("S");
						sCount++;
					} else if(marks[j] >= 80.0f && marks[j] <= 89.0 ) {
						System.out.println("A");
					} else if(marks[j] >= 70.0f && marks[j] <= 79.0 ) {
						System.out.println("B");
					} else if(marks[j] >= 60.0f && marks[j] <= 69.0 ) {
						System.out.println("C");
					} else if(marks[j] >= 55.0f && marks[j] <= 59.0 ) {
						System.out.println("D");
					} else if(marks[j] >= 50.0f && marks[j] <= 54.0 ) {
						System.out.println("E");
					} else {
						System.out.println("F");
					}
				}
				
				System.out.println("S Grade Count: " + sCount);
			}
		}
	}
	
	static float[] getStudentMarks(String regNo) {
		for (int i = 0; i < students.length; i++) {
			if(students[i].regNo.equals(regNo)) {
				return students[i].marks;
			}
		}
		float[] m = new float[1];
		return m;
	}
	
}


class Student {
	String regNo;
	int noOfCourse;
	float[] marks = new float[noOfCourse];
	
	public Student(String regNo, int noOfCourse, float[] marks) {
		this.regNo = regNo;
		this.noOfCourse = noOfCourse;
		this.marks = marks;
	}
}