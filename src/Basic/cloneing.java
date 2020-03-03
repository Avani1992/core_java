/*  Cloneable:-
          1) The process of creating exactly duplicate object is called cloning.
         2) We can create a duplicate object only for the cloneable Interface. 
         3) We can create cloned object by using clone() 
        4) The main purpose of the cloning is to maintain backup.
 * */
package Basic;

public class cloneing implements Cloneable {
	
	int a=10;
	int b=20;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		cloneing c1=new cloneing();
		System.out.println("Original: "+c1.a+"----"+c1.b);// 10----20
		
		cloneing c2= (cloneing) c1.clone();// copy of c1
		System.out.println("Copy: "+c2.a+"----"+c2.b); // 10----20

	}

}
