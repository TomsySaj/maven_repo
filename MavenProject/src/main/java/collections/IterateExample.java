package collections;


import java.util.*;

public class IterateExample {

	public static void main(String[] args) {
		Set<String> color=new HashSet<String>();
		color.add("Black");
		color.add("Blue");
		color.add("Green");
		//System.out.println(color);
		
		/*Iterator <String> i=color.iterator();
		while(i.hasNext()) {//contains or not
			System.out.println(i.next());//for printing next element
		}
		i.remove();
		System.out.println(color);//remove last element*/
		for(String c:color)
		{
			System.out.println(c);
		}
		

	}

}
