package DEMO;

class Student
{
	int regNumber;
	String studentName;
	
	Student(int reg_no, String name){
		this.regNumber = reg_no;
		this.studentName = name;
	}
}
public class Studentmain 
{
	public static void main(String[] args) {
		
		// Declare array of integers
		Student[] arr;
		arr = new Student[5];
		
		arr[0] = new Student(12341, "Manish");
		arr[1] = new Student(12342, "Aravind");
		arr[2] = new Student(12343, "Satish");
		arr[3] = new Student(12344, "Hari");
		arr[4] = new Student(12345, "Ahmed");
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		for (int i = 0; i < arr.length; i++)
			System.out.println("Student with Registration Number " +
						arr[i].regNumber + " is: "+ arr[i].studentName);
		
		
	}

}