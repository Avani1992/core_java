package array_prac;

import java.util.Arrays;

public class reverse_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int b=3;
		int c[]=new int[a.length];
		int d=3;
		int i=0;
//		while(i<b)
//		{
//			c[i]=a[d];
//			i=i+1;
//			d=d-1;
//		}
//		
//		//Arrays.sort(c);
//		//Arrays.toString(c);
		
		
		for(int p=0;p<a.length;p++)
		{
			while(p<b)
			{
				d=d-1;
			c[p]=a[d];
			
			}
//			if(p>=b)
//			{
//				d=4;
//			}
		}
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}

	}

}
