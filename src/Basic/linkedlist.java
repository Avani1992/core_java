package Basic;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(0, 50);
		ll.add(30);
		ll.addFirst("IBM");
		ll.addLast("HP");
		System.out.println(ll); // [IBM, 50, 10, 30, HP]
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		
		ll.addAll(al);
		System.out.println("After adding Arraylist: "+ll); // [IBM, 50, 10, 30, HP, 10, 30]
		
		ll.remove(); 
		System.out.println("After removing: "+ll); // [50, 10, 30, HP, 10, 30]
		
		ll.remove(2);
		System.out.println("After removing 2nd index element: "+ll); // [50, 10, HP, 10, 30]
		
		ll.removeLast();
		System.out.println("After removing last element: "+ll); // [50, 10, HP, 10]

//		ll.remove(10); consider as a 10th index..not 10 number...so indexoutofbound exception...
//		System.out.println("After removing 10 : "+ll); // [50, 10, HP, 10, 30]

		
		
		

	}

}
