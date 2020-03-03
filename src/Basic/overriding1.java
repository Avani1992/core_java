// only Method overriding possible with 2 class...
package Basic;

public class overriding1 {
	
	void m1(int a)
	{
		System.out.println("overriding1 A is: "+a);
	}
	void m2(String s)
	{
		System.out.println("overriding1 S is: "+s);
	}
}
class overriding2 extends overriding1
{

	void m2(String s)
	{
		System.out.println("overriding2 S is: "+s);
	}
	public static void main(String[] args) 
	{
	overriding2 o2=new overriding2();
	o2.m1('A');
	o2.m2("Kuman");
			

	}

}
