package SuperKeyword;

public class SuperVariableC extends SuperVariableP {
	int a=10;
	public static void main(String[] args) {
		
		SuperVariableC obj=new SuperVariableC();
		obj.display();
		
		}
	public void display()
	{
		System.out.println("Child class value "+a);
		System.out.println("Parent Class value "+super.color);
	}

}
