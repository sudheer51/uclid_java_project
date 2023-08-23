
public class ClassMembers {
	
	int rollno=1;
	char section='A';
	static String schoolName="ABC";
	public static void main(String[] args) 
	{
		ClassMembers s1 = new ClassMembers();
		s1.rollno=2;
		s1.section='B';
		System.out.println(s1.rollno);
		System.out.println(s1.section);
 
		ClassMembers s2= new ClassMembers();
		System.out.println(s2.rollno);
		System.out.println(s2.section);
		System.out.println(ClassMembers.schoolName);
		 
	}

}
