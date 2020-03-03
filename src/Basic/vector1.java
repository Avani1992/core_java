package Basic;

import java.util.ArrayList;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		v.add(20);
		v.add("IBM");
		v.add(1, "HP");
		v.addElement(50);
		System.out.println(v); // [20, HP, IBM, 50]
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		
		v.addAll(al);
		System.out.println("After adding arraylist: "+v); // [20, HP, IBM, 50, 10, 30]
		
		System.out.println("Size is: "+v.size()); // 6
		
		
	
		System.out.println("Contains arraylist element:"+v.containsAll(al)); // true
		
		v.remove(5); // remove 5th index element...
		
		System.out.println("Contains arraylist element:"+v.containsAll(al)); // false
		
		v.removeElementAt(1);
		System.out.println("After removing: "+v);
		
	}

}
