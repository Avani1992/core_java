package array_prac;

/*
 * For an array, inversion count indicates how far (or close) the array is from being sorted.
 *  If array is already sorted then inversion count is 0. If array is sorted in reverse order that 
 *  inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 * */
public class inversion_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,1,3,5};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					count=count+1;
				}
			}
		}
		System.out.println(count);

	}

}
