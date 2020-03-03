package Basic;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		char ch[]= {'a','b','c','d'};
//		
//		String s1=new String(ch);
//		System.out.println(s1); // abcd
//		
//		String s2=new String(ch,1,3);
//		System.out.println(s2); // bcd
//		
//		byte[] b1={65,66,67,68,69,70};  
//        String str6=new String(b1,2,4);   
//        System.out.println(str6); // CDEF
//		
//        String str1=new String("prasanna");
//        str1.concat("hello"); 
//        String str2=str1.concat("aruna");  
//        str2.concat("nandhu");   
//        System.out.println(str1); // prasanna
//        System.out.println(str2);  // prasannaaruna
//        
//        String  st1="Prasanna"; // Prasanna
//        st1.concat("soft"); 
//        String  st2=st1.concat("soft"); // Prasannasoft
//        String str3=st2; // Prasannasoft
//        String str4="Prasanna".concat("durgaGod");  // Prasannadurgagod
//        String str5=str4; // Prasannadurgagod
//        System.out.println(st2==str3);  // true
//         System.out.println(st1==st2);  // false
//      System.out.println(st1==str3); // false
//        System.out.println(st2==str4); // false
//       System.out.println(str5==str4); // true
		
		String s1="IBM";
		String s2=new String("IBM");
		String s3=s2;
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s3.equals(s1));//true
		
		string s=new string();
		System.out.println(s.toString());// <Basic.string@15db9742> tostring() used
		
		
		

	}

}
