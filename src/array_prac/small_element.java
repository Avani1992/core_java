package array_prac;

import java.util.ArrayList;
import java.util.Arrays;

public class small_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {7,4,3,10,20,15,5};
		int b=3;
		
		 Arrays.sort(a);
		 System.out.println(Arrays.toString(a));
		 System.out.println("Third smallest element:"+a[2]);

	}

}
