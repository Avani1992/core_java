package array_prac;
/*
 * i/p:a[]={2,1,6}
 * b[]={1,5}
 * now 2^1 >1^2, 2^5 >5^2 , 1^1 !> 1^1 , 6^1 >1^6 and 6^5 !> 5^6.
 * so count of greater than is 3.
 * */
public class array_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,1,6,4};
		int b[]= {1,5};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
	
				if(Math.pow(a[i],b[j])>Math.pow(b[j],a[i]))
					
					count=count+1;
			}
			
		}
		System.out.println(count);
		

	}

}
