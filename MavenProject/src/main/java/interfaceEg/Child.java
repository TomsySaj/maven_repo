package interfaceEg;
//To achieve multiple inheritance
public class Child implements ParentA,ParentB {

	public static void main(String[] args) {
		
		Child ob=new Child();
		ob.print();
		ob.disp();
		ob.color();
		ob.sky();
		

	}
	public  void print() {
		System.out.println("HI....Parent A method1");
		
	}
	public void disp()
	{
		System.out.println("Parent A method2");
	}
	public void color() {
		System.out.println("Parent B method1");
	}
	public  void sky()
	{
		System.out.println("Parent B method 2");
	}

}
