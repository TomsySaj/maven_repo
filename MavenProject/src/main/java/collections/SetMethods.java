package collections;

import java.util.*;

public class SetMethods {

	public static void main(String[] args) {
		Set<String> color=new HashSet<String>();
		color.add("Black");
		color.add("Blue");
		color.add("Green");
		System.out.println(color);
		
		Set<String> veg=new HashSet<String>();
		veg.add("Potato");
		veg.add("Tomato");
		veg.add("Cabbage");
		System.out.println(veg);
		
		color.addAll(veg);//method1
		System.out.println(color);
		System.out.println(veg);
		
		System.out.println(color.containsAll(veg));//method2
		
		System.out.println(color.removeAll(veg));
		System.out.println(color);
		System.out.println(veg);

	}

}
