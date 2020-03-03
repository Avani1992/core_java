package Basic;

public class ThisSuper {
	
	int a=2;
	String s="Pinga";
	
	ThisSuper()
	{
		System.out.println("Parent class constructor");
	}
	void m1(int a,String s)
	{
		System.out.println("Instance variable="+(this.a+this.s));
		System.out.println("Local variable="+(a+s));
		
		
	}
}

class Child5 extends ThisSuper{
	public Child5() 
	{
		super();
		System.out.println("Parent class constructor in Child class...");
	}
	Child5(int c)
	{
		this();
		System.out.println("C is: "+c);
	}

	void m2()
	{
		super.m1(5, "Dinga");
		System.out.println("Parent class method using Super...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child5 c1=new Child5(100);
		c1.m2();

	}
}

