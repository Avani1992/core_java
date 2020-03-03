package Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1=new LinkedList();
		l1.add(100);
		l1.add("IBM");
		l1.add(12.45);
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("Dinga");
		hs.addAll(l1);
		
		System.out.println("Set="+hs);// set=[100,IBM,Dinga,12.45]
		
		hs.remove("IBM");
		System.out.println("After removing Set="+hs); // [100,Dinga,12.45]
		
		//hs.clear();
		//System.out.println("Set="+hs); // set=[]
		
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add(500);
		lh.add(true);
		lh.add(hs);
		
		System.out.println("Linked Hashset="+lh); // [500, true, [100, Dinga, 12.45]]
		
		
		
		
	}

}
