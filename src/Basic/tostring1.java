package Basic;

public class tostring1 {
	
	String sname; 
    int rollno; 
    tostring1(String sname,int rollno)
         {
  this.sname=sname;   
  this.rollno=rollno;
         }
//overriding of the tostring method  otherwise print packagename.classname@hashcode.
  public String toString() 
         { 
 return sname+"***"+rollno; 
                } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tostring1 t1=new tostring1("AVANI", 10);// Here t1==t1.toString(); both r same.we can use any one of them.
		System.out.println(t1); // AVANI***10
		System.out.println(t1.toString()); // AVANI***10
		

        String str="ratan";
        System.out.println(str); // ratan
        System.out.println(str.toString()); // ratan

	}

}
