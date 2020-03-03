/*1.The underlying data Structure is BalencedTree. 
  2. Insertion order is not preserved it is based some sorting order.
  3. Hetrogeneous data is not allowed. 
  4. Duplicate objects are not allowed 
  5. Null insertion is possible only once.
 */
package Basic;

import java.util.SortedSet;
import java.util.TreeSet;

public class treeset {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(700);
		ts.add(500);
		ts.add(50);
		//ts.add(null);
		ts.add(45);
		//ts.add(null);
		
		System.out.println(ts);
		
		SortedSet s1=ts.headSet(100);   
        System.out.println(s1);//[45,50]
        
        SortedSet s2=ts.tailSet(100);
        System.out.println(s2);//[100,500,700]  
        
        SortedSet s3=ts.subSet(50,700); 
        System.out.println(s3);//[50,100,500] 
      

	}

}
