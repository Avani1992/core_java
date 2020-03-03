/*Given a string S consisting only '0's and '1's, 
 *  print the last index of the '1' present in it.
 * 
 * */

package array_prac;

public class last_index_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="0000101";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				c=i;
			}
			
		}
		if(c>0)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(-1);
		}

	}

}
