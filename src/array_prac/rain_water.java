/*
starting bar is 6.
second bar is 4 means 6>4 it's 6-4=2
third bar is 3 means  6>3 it's 6-3=3.
fourth bar is 9 means 6<9 it's 0.
total=5.
 * 
 * */
package array_prac;

public class rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,4,3,9};
		int water=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					water=water+(a[i]-a[j]);
				}
			}
			break;
		}

		System.out.println(water);
	}

}
