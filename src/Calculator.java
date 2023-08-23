public class Calculator  
{

	int a;
	int b;
	static int c;
	public void addition()
	{
		System.out.println(a+b);
		System.out.println(c);
	}
	public void subtract()
	{
		System.out.println(a-b);
	}
	public void multiply()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		 Calculator calc = new Calculator();
		 calc.addition();
		
	}
}
	 