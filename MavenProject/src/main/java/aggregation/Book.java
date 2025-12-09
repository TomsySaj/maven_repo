package aggregation;

public class Book {
	String name;
	int num;
	Author a;
public static void main(String[] args) {
	Author ob=new Author("jane",67892);
	Book o2=new Book("Rain",678,ob);
	o2.disp();
	
		

	}
	Book(String name,int num,Author a)
	{
		this.name=name;
		this.num=num;
		this.a=a;
		
		
	}
	void disp()
	{
		System.out.println("Book name:"+name);
		System.out.println("Book number:"+num);
		a.print();
	}

	

}
