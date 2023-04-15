
public class MethodOverload {
	
	
	void sum (int a, int b)
	{
		int s=a+b;
		System.out.println("Sum of two number is: "+s);
	}
	
	void sum (int a,int b,int c) {
		int d = a+b+c;
		System.out.println("Sum of three number is: "+d);
	}

	
	public static void main(String[] args) {
		
		MethodOverload c = new MethodOverload();
		c.sum(20, 45);
		c.sum(2, 5, 6);
		
	}
}
