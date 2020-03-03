package Basic;

import java.util.ArrayList;

public class ArrayListDemo {
	
	
public static void main(String[] args)  
     {
ArrayList<Integer> al=new ArrayList<Integer>(); 
al.add(10);
al.add(20);
al.add(30);  
al.add(40);
System.out.println(al);
Integer[] a=new Integer[al.size()];
al.toArray(a); // Convert Arraylist to array...

int sum=0;  
for(int j=0;j<a.length;j++) 
    {
sum=sum+a[j];    
System.out.println(a[j]); 
    }
System.out.println(sum); 
    
} 
} 


