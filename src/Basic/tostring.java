package Basic;

public class tostring {
	
	public String toString()
	{
		return "Hello";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 tostring t=new tostring();   
         System.out.println(t); // Hello
         System.out.println(t.toString());//Hello. Test class toString() 
          String str="durgasoft";  
          System.out.println(str); // durgasoft
          System.out.println(str.toString());//durgasoft. String class toString() 
 
         StringBuffer sb=new StringBuffer("ratansoft"); 
         System.out.println(sb); // ratansoft 
         System.out.println(sb.toString());//ratansoft. StringBuffer class toString()
 

	}

}
