/*Given an unsorted array of size N. Find the first element in array such that 
 * all of its left elements are smaller and all right elements to it are greater than it.
 * 
 * */
package array_prac;

public class smaller_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4 ,3 ,2 ,7 ,8 ,9};
		 
	
		for(int i=0;i<a.length;i++)
		{
			int j=i+1;
			if(j<a.length-1)
			if(a[i]>a[j])
			{
				
			}
			else
			{
				System.out.println(a[j]);
				
				i=j;
				
			
			}
			
		}
//				
//		
		}
		
	

}
