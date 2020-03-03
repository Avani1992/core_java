package Basic;

import java.util.Stack;

public class stack1 {
	
	public static void main(String[] args)
    {
Stack s=new Stack();  
     s.push("A");  
    s.push(10); 
    s.push("aaa"); 
System.out.println(s); // [A,10,aaa]
      s.pop();
System.out.println(s); // [A,10]
System.out.println(s.search("A")); // 2
     }

}
