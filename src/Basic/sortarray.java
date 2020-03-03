package Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,2,4,6,7};
		int b[]= {1,3,5,9};
		
		int[]c = new int[a.length+b.length];
	      int count = 0;
	      
	      for(int i = 0; i < a.length; i++) { 
	         c[i] = a[i];
	         count++;
	      } 
	      for(int j = 0; j < b.length;j++) { 
	         c[count++] = b[j];
	      } 
	      for(int i = 0;i < c.length;i++) 
	      {
	    	  System.out.print(c[i]+" ");
	      }
	      Arrays.sort(c);
	      System.out.println(Arrays.toString(c));
	}

}
