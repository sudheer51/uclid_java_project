public class Student_Copy  
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
		
		Student_Copy s1 = new Student_Copy();
		s1.rollno=10;
		
		s1.read(); 
		s1.write();
		
		Student_Copy s2 = new Student_Copy();
		s2.rollno=20;
		s2.name="Shobha";
		s2.read();
		s2.write();
		
		
	}
}
	 