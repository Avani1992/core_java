package Basic;

public class variable {
	
	static int a=10;
	char c='A';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static/Class Variable---");
		System.out.println(variable.a);// 10
		a=50;
		System.out.println(a);//50
		System.out.println(variable.a);//50
		
		System.out.println("Instance Variable-----");
		
		variable v=new variable();
		System.out.println(v.c);//'A'
		
		variable v1=new variable();
		v1.c='K';
		System.out.println(v1.c);//'K'
		
		variable v2=new variable();
		System.out.println(v2.c);//'K'
		
		
		

	}

}
