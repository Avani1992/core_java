package Basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(3, "SQL");
		System.out.println("---Using Forloop---");
		for(Map.Entry<Integer, String> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("---Using Iterator---");
		Iterator<Map.Entry<Integer, String>> e1=hm.entrySet().iterator();
		while(e1.hasNext())
		{
			Map.Entry<Integer, String> e2=e1.next();
			System.out.println(e2.getKey()+"----"+e2.getValue());
		}
		System.out.println("---Using Foreachloop---");
		for(Integer key:hm.keySet())
		{
			System.out.println(key+"---"+hm.get(key));
			
		}

	}

}
