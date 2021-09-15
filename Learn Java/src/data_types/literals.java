package data_types;

public class literals {

	public static void main(String[] args) {
		int x=0b1010;//integer literal using binary
		System.out.println(x);
		int y=123_456_789;//Underscores will be discarded
		System.out.println(y);
		int z=123____456___789;
		System.out.println(z);
		//Binary Literals
		int bina = 0b1101_0101_0001_1010;
		System.out.println(bina);
		//FLOATING POINT LITERALS
		double num = 9_433_5_54.0;
		double num1 = 94_5_287_6.43_65_3;
		System.out.println(num);
		System.out.println(num1);
		
		//Boolean Literals
		/*
		 * 1 or 0 are not compiled as boolean value 
		 * It is Integer value
		 * 
		 * int a=0;
		 * while(a){
		 * System.out.println("Hello");
		 * }
		 * 
		 * The above program will be a compile time error as while cannot take 1 as 
		 * boolean value.
		 * */
		//CHARACTER LITERALS
		char s = '\141';//Octal notation for 'a'. '\'followed by number
		System.out.println(s);
		char rr = '\u0062';//Hexadecimal notation for 'b'. '\' followed by 'u' and number.
		System.out.println(rr);
		System.out.println("Hai get\"s");
	}

}
