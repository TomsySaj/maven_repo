package polymorphism;

public class PolyC extends PolyP{

	public static void main(String[] args) {
		PolyC ob=new PolyC();
		ob.print();
		
		

	}
	public void print()
	{
		super.print();
		System.out.println("Polymorphism Child Method");
	}


}
