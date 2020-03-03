package Basic;

public class MainMethodoverloading {
	public static void main()
	{
		System.out.println("Main method without Parameter");
	}
	public static void main(int a)
	{
		System.out.println("Main method with Parameter a is: "+a);
	}
	public static void main(String s)
	{
		System.out.println("Main method with Parameter s is: "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMethodoverloading.main();
		MainMethodoverloading.main(100);
		MainMethodoverloading.main("IBM");

	}

}
