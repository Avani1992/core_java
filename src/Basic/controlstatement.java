package Basic;

public class controlstatement {
	
	int m1(int a,int b) // int return
	{
		switch (a) {
		case 100:
			System.out.println("a="+a);
			break;
		case 200:
			System.out.println("a="+a);
			break;
		case 300:
			System.out.println("a="+a);
			break;

		default:
			System.out.println("Default...");
			break;
		}
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		controlstatement cs=new controlstatement();
		System.out.println("int return is:"+cs.m1(300,200));
		
//		int i=21;
//		if(i<20)
//		{
//			for(;i<20;i++)
//			{
//				if(i==15)
//				{
//					break;
//				}
//				System.out.println("i="+i);
//			}
//		}
//		else
//		{
//			do
//			{
//				System.out.println("i="+i);
//				i--;
//			}while(i>10);
//		}
//		System.out.println("-------------while loop------------");
//		
//		int j=21;
//		
//		while (j>15) 
//		{
//			if(j==18)
//			{
//				j--;
//				continue;
//				
//			}
//			System.out.println("j in while="+j);
//			j--;
//		}
	}

}


