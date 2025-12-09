package exceptionHandling;

public class Example3 {

	public static void main(String[] args) {
		
		Example3 ob=new Example3();
		try {
		ob.eligible(2);
	}
		catch(ArithmeticException e)
		{
			System.out.println("Enter valid age");
		}
	}

	public void eligible(int age) throws ArithmeticException
	{
		if(age<=18)
		{
			throw new ArithmeticException("Access Denied");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
	}

}
