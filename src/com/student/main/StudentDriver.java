package src.com.student.main;

public class StudentDriver {
	
	public static void main(String[] args){
		Student student1 = new Student("c0979978", 27, "DT9657-1");//constructor
		Student student2 = new Student("c0258866", 35, "DT8874-2");
		
		student1.displayStudentDetails(); 
		student1.updateYear();
		
		student2.displayStudentDetails();
		student2.updateYear();
	}
}
