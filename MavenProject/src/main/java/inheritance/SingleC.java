package inheritance;

public class SingleC extends SingleP {

	public static void main(String[] args) {
		SingleC o=new SingleC();
		o.dance();
		o.draw();
		o.write();
	}
	public void dance()
	{
		System.out.println("DANCE....... :)");
	}

}
