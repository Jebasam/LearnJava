package variables;

public class Type_Promotions {

	public static void main(String[] args) {
		/*
		byte a = 40;
		byte b=50;
		byte c = 100;
		int d = a*b/c;
		System.out.println("d is "+d);
		byte e = 50;
		e = (byte) (e*2);//Casting int to byte.
		System.out.println("e is "+e);
		*/
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f*b)+(i/c)-(d*s);
		System.out.println("(f*b)+(i/c)-(d*s)");
		System.out.println("Result is "+result);
	}

}
