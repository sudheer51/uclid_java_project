public class Student  
{

	int rollno;
	String name;
	
	public void read(){
		System.out.println("Student  " + name+"  reads well");
	}
	public void write(){
		System.out.println("Student  " + name+"  writes well");
	}
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.rollno=10;
		
		s1.read(); 
		s1.write();
		
		Student s2 = new Student();
		s2.rollno=20;
		s2.name="Shobha";
		s2.read();
		s2.write();
		
		
	}
}
	 