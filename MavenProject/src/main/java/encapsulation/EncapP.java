package encapsulation;

public class EncapP {
	private int n;
	private String name;
	public void set(int n,String name)
	{
		this.n=n;
		this.name=name;
		
	}
	public void get()
	{
		System.out.println("Encapsulation Parent number"+n);
		System.out.println("Encapsulation Parent name"+name);
		
	}

}
