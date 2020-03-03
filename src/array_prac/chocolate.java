package array_prac;

import java.util.Arrays;

public class chocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3 ,4 ,1 ,9 ,56 ,7 ,9 ,12};
		int b[]=new int[4];
		int c=4;
		Arrays.sort(a);
		Arrays.toString(a);
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			int j=i+c;
			if(j<a.length)
			{
				b[i]=a[j]-a[i];
			}
			else
			{
				break;
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			//System.out.println(b[i]);
		}
		int no=0;
		for(int i=0;i<b.length;i++)
		{
				for(int j=i+1;j<b.length;j++)
				{
					if(b[j]<b[i])
					{
						no=b[j];
						i=j;
					}
				}break;
		}
		System.out.println(no);
	
	}

}
