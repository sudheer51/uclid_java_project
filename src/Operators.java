
public class Operators {

	public static void main(String[] args) {
		
		int a=72,b=9;//75 dividend , 9 divisor
		
		int c = a/b ; // Quotient
		System.out.println("Quotient:::" + c);
		
		int d = a%b; // remainder
		System.out.println("Remainder:::" + d);
		
		
		//Greatest of three numbers
		int a1=60,b1=30,c1=40,d1=50;
		
		if(a1>b1 && a1>c1 && a1>d1)
		{
			System.out.println("a1 is greatest::" + a1);
		}
		else if(b1>a1 && b1>c1)
		{
			System.out.println("b1 is greatest " + b1);
		}
		else
		{
			System.out.println("c1 is greatest"  + c1);
		}
		
	}
}
