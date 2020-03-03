package array_prac;

public class make_largest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3 ,30 ,34 ,5 ,90};
		String s=a[a.length-1]+"";
		
		for(int i=a.length-2;i>=0;i--)
		{
			
			if(a[i]==10 |a[i]==20 |a[i]==30|a[i]==40|a[i]==50|a[i]==60|a[i]==70|a[i]==80|a[i]==90|a[i]==100)
			{
				s=s+a[i-1];
				s=s+a[i];
				i=i-1;
			}
			else
			{
				s=s+a[i];
			}
			
			
				
		
		}
		System.out.println(s);
	}

}
