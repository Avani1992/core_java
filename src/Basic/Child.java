package Basic;
class Parent{
	
	int moneyP=10000;
	void amountP()
	{
		System.out.println("Parent class="+moneyP);
	}
}
// single Inheritance
public class Child extends Parent{ 
	
	int moneyC=1000;
	void amountC()
	{
		System.out.println("Child class="+moneyC);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Child c1=new Child();
//		c1.amountP();
//		c1.amountC();

	//}

}
// Multilevel inheritance
class Child1 extends Child
{
	int moneyc1=100;
	void amountC1()
	{
		System.out.println("Child1 class="+moneyc1);
	} 

//	public static void main(String[] args) 
//	{
//		// TODO Auto-generated method stub
//		Child1 c1=new Child1();
//		c1.amountP();
//		c1.amountC();
//		c1.amountC1();
//	}
}

// Hierarchical Inheritance: class Child2 extends Parent also...1 parent 2 child..


class Child2 extends Parent
{
	int moneyc2=10;
	void amountC2()
	{
		System.out.println("Child class="+moneyc2);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child c=new Child();
		c.amountP();
		c.amountC();
		Child2 c1=new Child2();
		c1.amountP();
		//c1.amountC();
		c1.amountC2();
	}
}
// Hybrid Inheritance.. Combination of More than one inheritance single + multilevel

// class child extends Parent -> single
//class child1 extends child  -> Multilevel