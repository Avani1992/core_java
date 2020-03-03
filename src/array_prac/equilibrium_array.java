package array_prac;

public class equilibrium_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,5,2,2};
		int pos=0;
		int sum=0;
		if(a.length==1)
		{
			pos=1;
		}
		else
		{
			int leftsum=0;
			int rightsum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			for(int i=0;i<a.length;i++)
			{
				rightsum=sum-a[i];
				sum=sum-rightsum;
				if(leftsum==rightsum)
				{
					pos=i;
				}
				else
				{
					leftsum=leftsum+a[i];
				}
			}
		}
		System.out.println(pos);
	}

}
