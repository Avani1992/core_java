package array_prac;

public class spiral_matrix {

	private static final boolean True = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				System.out.print(a[i][j]+"  ");
//			}
//			System.out.println(" ");
//		}
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}break;
			}
		}
	
		
		

	}

}
