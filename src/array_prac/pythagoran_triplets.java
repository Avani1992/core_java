/*pythagoras formula apply..
 * a=[3,4,2,5,6];
 * b=square of a=[9,16,4,25,36]
 * here 9+16=25 so we get three triplets.so YES.
 * 
 * */
package array_prac;

public class pythagoran_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,4,2,5,6};
		
		int b[]=new int[a.length];
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]*a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			//System.out.println(b[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]+b[i+1]==b[j])
				{
					count=1;
					break;
				}
			}
		}
		if(count==1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
