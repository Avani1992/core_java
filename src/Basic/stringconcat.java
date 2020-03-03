package Basic;

public class stringconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String age="22";  
        String s="Dinga"+age+" years old.";
        System.out.println(s); // Dinga22 years old.
        System.out.println(s.length()); // 18

       String str1="durga"; 
       String str2="ratan"; 
       String str3=str1.concat(str2); // durgaratan
       System.out.println(str3);   
       System.out.println(str3.length()); // 10
       System.out.println(str3.toUpperCase()); // DURGARATAN
       System.out.println("HELLO".toLowerCase()); // hello
        
           int a=22; 
     String s1="he is "+a+" years old."; 
     System.out.println(s1); // he is 22 years old.
     
     String s2="six "+2+2+2;   // 2+2+2 treated as a string.bcz it is after string .
     System.out.println(s2);  // six 222
     
     String s3="six "+(2+2+2);   // (2+2+2) trated as a int.
     System.out.println(s3);// six 6

	}

}
