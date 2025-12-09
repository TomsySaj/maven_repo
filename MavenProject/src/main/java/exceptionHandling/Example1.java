package exceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		String name="Tomsy";
		try {
		int a=100;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
		
		}
		catch(ArithmeticException e)
		{
			
		}
		System.out.println("Name ="+name);
	}

}
