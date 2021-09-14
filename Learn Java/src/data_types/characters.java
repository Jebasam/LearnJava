package data_types;
public class characters {
	public static void main(String[] args) {
		char ch1,ch2;
		ch1=88;
//The ch1 output will become X as unicode representation of 88 is X
		ch2='Y';
		System.out.print("ch1 and ch2 : ");
		System.out.println(ch1+" "+ch2);
		ch2++;//Integer operations on char
		System.out.print("ch2 is now : ");
		System.out.println(ch2);
	}
}
