package Basic;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1="prasanna"; 
//        str1.concat("soft"); 
//        System.out.println(str1);//prasanna 
//        String str2="prasanna";
//       System.out.println(str1.equals(str2));// true. String class .equals() compare value
// 
//        StringBuffer sb=new StringBuffer("prasanna");   
//        sb.append("soft");  
//        System.out.println(sb);//prasannasoft  
//        StringBuffer sb1=new StringBuffer("prasanna"); 
//        StringBuffer sb2=new StringBuffer("prasanna"); 
//        StringBuffer sb3=sb2;
//       System.out.println(sb1.equals(sb2));//false//Object class .equals() compare address
//       System.out.println(sb3.equals(sb2));//true//Object class .equals() compare address
       
       StringBuffer sb4=new StringBuffer(); 
       System.out.println(sb4.capacity());//default capacity 16 
       StringBuffer sb5=new StringBuffer(5); 
       System.out.println(sb5.capacity());//your provided capacity  5
       StringBuffer sb6=new StringBuffer("rattaiah");  
       System.out.println(sb6.capacity());//initial capacity+provided string
                                                                 // length  24   
        System.out.println(sb6.length());   //8 
 

	}

}
