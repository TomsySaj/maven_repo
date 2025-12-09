package accessModifier1;

public class Access1 {

	public static void main(String[] args) {
		Access1 ob=new Access1();
		ob.display1();
		ob.display2();
		ob.display3();
		ob.display4();

	}
	public void display1()
	{
		System.out.println("Public");
	}
	protected void display2()
	{
		System.out.println("Protected");
	}
	void display3()
	{
		System.out.println("Default");
	}
	private void  display4()
	{
		System.out.println("Private");
	}

}
