
public class DataTypes 
{
	//global variable
	 static byte b1;
	static int i1=10;
	static boolean result;
	static char ch='a';
	
	 
	
	
	public static void main(String[] args) {
		int i=10;//hard coded
		
		
		System.out.println(10);//hard coded values
		
		//local variable requires initialization
		byte b2=0;
		int i2=10;
	
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		float f = 23.0f;//for float the character 'f' to be associated
		System.out.println(f);
		
		double d =23.0;
		System.out.println(d);
		
		System.out.println(result);
		
		System.out.println("Value"+ch+"printed" );
		
		i1=20;
		System.out.println(i1);
		
		
	}

}

//1 -> 1 * 2 power 0 -> 1*1 -> 1
//1-> 1 * 2 power 1  -> 1*2->  2
//1-> 1 * 2power 2 ->   1* 4-> 4
//1-->8
//1 -->16
//1-->32
//1-->64
//1-->128
//1-> 0
