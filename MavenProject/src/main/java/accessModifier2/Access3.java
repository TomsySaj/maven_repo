package accessModifier2;

import accessModifier1.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access1 ob=new Access1();
		ob.display1();
		//ob.display2();
		//ob.display3();
		//ob.display4();
		Access3 ob1=new Access3();
		ob1.display1();
		ob1.display2();
		//ob1.display3();
		//ob1.display4();
		
	}

}
