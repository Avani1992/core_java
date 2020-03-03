package Basic;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		byte b=(byte) a;  // explicit narrowing
		System.out.println("int to byte b="+b);
		
		double d=a; // auto widening
		System.out.println("int to double d="+d);
		
		

	}

}
