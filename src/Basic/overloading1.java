// Method/Constructor/Operator overloading..
// Main method overloading possible
package Basic;


public class overloading1 {
	//Constructor overloading
	
	 overloading1() 
	{   
		 System.out.println("Constructor Overloading...");
		System.out.println("Without Parameter");
	}

	overloading1(int a) 
	{
		System.out.println("With Parameter");
		System.out.println("A is: "+a);
	}
	overloading1(boolean b,String s) 
	{
		System.out.println("With Parameter");
		System.out.println("B is: "+b);
		System.out.println("S is: "+s);
		
	}
	
	// Method overloading
	
	void m1(int a,double d)
	{
		System.out.println("Method overloading....");
		System.out.println("A is: "+a);
		System.out.println("D is: "+d);
	}
	void m1(char c)
	{
		System.out.println("C is: "+c);
	}
	
	public static void main(String[] args)
	{
		overloading1 o1=new overloading1();
		overloading1 o2=new overloading1(100);
		overloading1 o3=new overloading1(true, "IBM");
		
		o1.m1(78, 56.89);
		o2.m1('K');
		
		//operator overloading
		
		int a=10;
		int b=20;
		String s1="HP";
		String s2="Dell";
		System.out.println(a + b);
		System.out.println(a + s1);
		System.out.println(a + s2);
		System.out.println(b + s1);
		System.out.println(b + s2);
		System.out.println(s1 + s2);
		

	}

}
