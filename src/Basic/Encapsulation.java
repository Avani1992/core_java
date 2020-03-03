package Basic;

public class Encapsulation {
	
	private int a;
	private String s;
	
	void setInt(int a)
	{
		this.a=a;
	}
	int getInt()
	{
		System.out.println("a="+a);
		return a;
	}
	void setstring(String s)
	{
		this.s=s;
	}
	String getString()
	{
		System.out.println("s="+s);
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation e1=new Encapsulation();
		e1.setInt(100);
		e1.getInt();
		e1.setstring("Dinga");
		e1.getString();

	}

}
