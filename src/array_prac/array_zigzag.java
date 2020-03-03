/*Given an array A (distinct elements) of size N. Rearrange the elements of array in 
 * zig-zag fashion. The converted array should be in form a < b > c < d > e < f. 
 * The relative order of elements is same in the output 
 * i.e you have to iterate on the original array only.
 * 
 * */
package array_prac;

import java.util.ArrayList;

public class array_zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4 ,3 ,7 ,8 ,6 ,2 ,1};
		
		ArrayList al=new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			if(i+1<a.length)
			{
			if(a[i]<a[i+1])
			{
				al.add(a[i+1]);
				al.add(a[i]);
				
			}
			else
			{
				al.add(a[i+1]);
				
				
			}
			}
		}
		System.out.println(al);
	}

}
