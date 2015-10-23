package com.student.main;

public class Student {
	
	private String studentNumber;
	private int age;
	private String courseCode;
	
	public Student(String studentNumber, int age, String courseCode) {
		this.studentNumber = studentNumber;// the this. function specified exactly what you are refering to
		this.age = age;// the left hs ==right hs,, the age
		this.courseCode = courseCode;
	}
	
	public void displayStudentDetails(){
		System.out.println("The student's number is "+studentNumber+" and they are "+age 
				+" years old attending course "+courseCode);
	}
	
	public String updateYear(){
		//temp variable to hold updated course code
		String updatedCourseCode = null;
		if(courseCode.charAt(7)=='1'){
			updatedCourseCode = courseCode.replace('1', '2');
			courseCode = updatedCourseCode;
			System.out.println("This student has progressed to "+courseCode);
		}
		else if (courseCode.charAt(7)=='2'){
			updatedCourseCode = courseCode.replace('2', '3');
			courseCode = updatedCourseCode;
			System.out.println("This student has progressed to "+courseCode);
		}
		else if (courseCode.charAt(7)=='3'){
			updatedCourseCode = courseCode.replace('3', '4');
			courseCode = updatedCourseCode;
			System.out.println("This student has progressed to "+courseCode);
		}
		else if (courseCode.charAt(7)=='4'){
			System.out.println("This student is in 4th year and cannot progress any further.");
		}
		
		return updatedCourseCode;
	}
	
	public String getStudentNumber() {//getter student number
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {//setter student number
		this.studentNumber = studentNumber;
	}
	public int getAge() {//getter age
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourseCode() { //getter course code
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
