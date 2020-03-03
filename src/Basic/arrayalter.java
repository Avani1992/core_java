package Basic;

public class arrayalter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]=new int[a.length];
		int j=0;
		for(int i=(a.length-1);i>=(a.length/2);i--)
		{
			
			b[j]=a[i];
			j=j+2;
			
		}
		int j1=1;
		for(int i=0;i<a.length/2;i++)
		{
			b[j1]=a[i];
			j1=j1+2;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
