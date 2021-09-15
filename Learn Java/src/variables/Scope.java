package variables;

public class Scope {
	public static void main(String[] args) {
		int x = 10;
		if(x == 10) {
			int y = 20;
			System.out.println(x+" "+y);
			//X and y are known 
		}
		//y=20;//y not known here
		System.out.println(x);//x is still known here
		
		//Lifetime of a variable
		for(int a = 0;a<3;a++) {
			int y = -1;
			System.out.println(y);
			y=100;
			System.out.println(y);
		}
	}
}
