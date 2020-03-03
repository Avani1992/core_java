// Constructor,Instance/Static Method, Instance/Static/local Variable....
package Basic;

public class Execute {
	//Instance variable
	double d=78.89;
	char c='A';
			
	//Static variable
	static boolean b=true;
	static float f=56.78f;
	//0-argument constructor
	Execute() 
	{
		System.out.println("0-argument Constructor..");
	}
	//Parameterized Constructor
	Execute(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
		System.out.println("Parameterized Constructor..");
	}
	
	
	//Instance Method
	void run()
	{
		System.out.println("Instance Method without parameter...");
	}
	void display(String s)
	{
		System.out.println(s);
		System.out.println("Instance Method with parameter...");
	}
	
	
	//Static Method
	static void jump()
	{
		System.out.println("Static Method without parameter...");
	}
	static void walk(double d)
	{
		System.out.println(d);
		System.out.println("Static Method with parameter...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Local variable
		int a=10;
		String s="Kuman";
		
		Execute e1=new Execute();
		Execute e2=new Execute(101,"IBM");
		System.out.println("Local Variable="+a);
		System.out.println("Local variable="+s);
		
		System.out.println("Instance variable="+e1.d);
		System.out.println("Instance variable="+e2.c);
		
		System.out.println("Static variable="+Execute.b);
		System.out.println("Static variable="+Execute.f);
		
		e1.run();
		e1.display("Dispaly");
		
		Execute.jump();
		Execute.walk(45.67);
		

	}

}
