
public class ArraysExample {

	public static void main(String[] args) {

		// In array index starts from 0
		// Length has to be counted from 1
		// Assingment: Create an array for each datatype
		
		
		
		int student[] = new int[20];
		//valid index values for Arrays is : 0 .. 19
		System.out.println(student[0]);
		try {
			System.out.println(student[20]);//java.lang.ArrayIndexOutofBoundsException
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int marks[]=new int[6];
		System.out.println("Printing the marks");
		System.out.println(marks[0]);
		
		double[] d1 = new double[2];
		System.out.println(d1[0]);
		d1[0]=20.5;
		d1[1]=21.5;
		System.out.println("After assingment");
		System.out.println(d1[0]);
		System.out.println(d1[1]);
		
		long[] l1 = {1,2,3,4,5};
		System.out.println(l1[4]);
		System.out.println(l1.length);
		
		
		 
		
		
		
	}
}
