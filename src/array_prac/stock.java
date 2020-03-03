/*Find all the days on which you buy and sell the stock so that in between those
 *  days your profit is maximum.
 * 
 * */
package array_prac;

public class stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {23 ,13 ,25 ,29 ,33 ,19 ,34 ,45 ,65 ,67};
		int buy=0;
		int sell=0;
		for(int i=0;i<a.length;i++)
		{
			int j=i+1;
			if(j<a.length)
			{
				if(a[i]>a[j])
				{
					buy=buy+a[j];
					if(a[j]>=buy)
					{
						buy=buy-a[j];
						sell=sell+a[i];
						System.out.println("("+buy+" "+sell+")");
						i=j;
				}
					if(j==a.length-1)
					{
						buy=a[i];
						sell=a[j];
						System.out.println("("+buy+" "+sell+")");
						
					}
					
				}
				
			}
		}
		
		

	}

}
