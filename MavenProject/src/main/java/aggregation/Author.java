package aggregation;

public class Author {
	String name;
	int pincode;
	Author(String name,int pincode)
	{
		this.name=name;
		this.pincode=pincode;
		
	}
	void print()
	{
		System.out.println("Author name :"+name);
		System.out.println("Author pincode:"+pincode);
		
	}

}
