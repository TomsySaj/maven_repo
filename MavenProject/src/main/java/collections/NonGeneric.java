package collections;


import java.util.*;

public class NonGeneric {

	public static void main(String[] args) {
		List data=new ArrayList();
		data.add("Hello");
		data.add("Hi");
		data.add(10);
		data.add('B');
		System.out.println(data);
		
		Set number=new HashSet();
		number.add(10);
		number.add("Sona");
		number.add('s');
		System.out.println(number);
		
		

	}

}
