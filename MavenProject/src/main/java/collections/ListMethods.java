package collections;

import java.util.ArrayList;
import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
	
		List<String> Fruit=new ArrayList<String>();
		
		Fruit.add("StrawBerry"); //method1
		Fruit.add("Apple");
		Fruit.add("Orange");
		System.out.println(Fruit);
		
		
		System.out.println(Fruit.get(1));//method 2
		
		Fruit.set(0, "Apple");//method 3
		System.out.println(Fruit);
		
		System.out.println(Fruit.indexOf("Apple"));//method 4
		
		System.out.println(Fruit.lastIndexOf("Apple"));//method 5
		
		Fruit.remove(1);//method 6
		System.out.println(Fruit);
		
		System.out.println(Fruit.contains("Orange"));//method 7
		
		System.out.println(Fruit.isEmpty());//method 8
		
		System.out.println(Fruit.size());//method 9
		
		
		

	}

}
