package data_types;

public class booleans {
//booleans are the primitive type for logical values.
	public static void main(String[] args) {
		boolean b;
		b=false;
		System.out.println("b is "+b);
		b=true;
		System.out.println("b is "+b);
		if(b) System.out.println("This is executed.");
		b=false;
		if(b) System.out.println("This is not executed.");
		//boolean Value is sufficient to control If Statement.
		System.out.println("10>9 is " +(10>9));
		//Outcome of a relational operator is a boolean value.
	}

}
