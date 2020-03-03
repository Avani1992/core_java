package Basic;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		
		ArrayList al2=new ArrayList();
		al2.add("IBM");
		al2.add("TCS");
		al2.addAll(al); // add another arraylist..
		al2.add(1, "DELL"); // indexwise add element..
		System.out.println(al2);// [IBM, DELL, TCS, 10, 30]
		
		al2.remove("DELL"); // remove elementwise
		al2.remove(3); // remove indexwise..
		System.out.println("After removing:"+al2); // [IBM, TCS, 10]
		
		

	}

}
