package Basic;

public class Test {
	//instance variables 
    int a=10; 
     int b; 
//static variables
 static int i=100;
 static int j;
//instance methods  
void m1() 
   {
System.out.println("m1-instance method"); 
           }
void m2(int i,char ch,String str) 
      {
System.out.println(i); 
System.out.println(ch);
System.out.println(str);
            } 
   //static methods  
static void m3(int i,int j) 
        {
System.out.println(i); 
System.out.println(j); 
    }
static void m4(String str,char ch) 
       {
System.out.println(str); 
System.out.println(ch);  
        } 

  //constructors  
       Test()
        {
System.out.println("0 arg constructor");
          }
     Test(int i,int j)
        {
    	 System.out.println(i);
    	 System.out.println(j);
System.out.println("2 arg constructor"); 
     }  

//instance blocks  
    { 
System.out.println("instance block-1");
         } 
           { 
System.out.println("instance block-2");
                     } 

   //static block  
         static   
          { 
 System.out.println("Hi");   
 System.out.println("Hi");   
 System.out.println("Hi");
           }
       static   
        { 
System.out.println("software"); 
System.out.println("software"); 
System.out.println("software");    
              }
 public  static void main(String[] args)  
                  { 
      Test t=new Test();  
      Test t1=new Test(10,20); 
            t.m1();   
            t.m2(10,'r',"Prasanna"); 
               m3(100,200); 
               m4("Prasanna",'d');
      System.out.println(t.a);  
      System.out.println(t1.b); 
       System.out.println(i); 
       System.out.println(j);
             } 


}
