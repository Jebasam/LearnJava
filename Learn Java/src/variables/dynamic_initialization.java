package variables;

public class dynamic_initialization {

	public static void main(String[] args) {
		/*to ffind hypotenuse of the triangle */
		double a = 3.0,b = 4.0;
		double c = Math.sqrt((a*a)+(b*b));
		System.out.println(c);
		//c is dynamically initialized by computing the values of a&b.
	}

}
