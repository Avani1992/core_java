package Basic;

public class explicitNarrowing {
	
	void m1()
	{
		System.out.println("M1 method");
	}
	void m2()
	{
		System.out.println("M2 method");
	}
	
}

class Narrowing extends explicitNarrowing
{
	void m3()
	{
		System.out.println("M3 method...");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		explicitNarrowing en=new Narrowing();  // up narrowing
		en.m1();
		Thread.sleep(2000);
		en.m2();
		
		System.out.println();
		Narrowing n1= (Narrowing)en ; // down narrowing
		n1.m1();
		Thread.sleep(2000);
		n1.m2();
		Thread.sleep(2000);
		n1.m3();
		
		
		
		
	}
}
