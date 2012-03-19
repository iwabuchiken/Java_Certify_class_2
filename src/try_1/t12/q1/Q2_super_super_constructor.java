/************************************`
 * Q2_super_super_constructor.java
 * Author: iwabuchiken
 * Date: 2012/2012/03/15/15:48:40
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. 
 ************************************/
/**
 * 
 */
package try_1.t12.q1;

/**
 * @author iwabuchiken
 *
 */
public class Q2_super_super_constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* members			*/
		SubClass_Q2	sub1	= new SubClass_Q2();
//		SubClass_Q2	sub1	= new SubClass_Q2("Chandra");
		
		/* show					*/
		System.out.println("done.");
	}

}

class SuperSuperClass_Q2 {
	/* constructor			*/
	SuperSuperClass_Q2() {
		System.out.println("I am a SuperSuperClass");
	}
	
	SuperSuperClass_Q2(String name) {
		System.out.println("I am a SuperSuperClass");
		System.out.println("My name is " + name);
	}
}//class SuperSuperClass_Q2

class SuperClass_Q2 extends SuperSuperClass_Q2 {
	/* constructor			*/
	SuperClass_Q2() {
		System.out.println("I am a SuperClass");
	}
	
}//class SuperClass_Q2

class SubClass_Q2 extends SuperClass_Q2{
	/* constructor			*/
//	SubClass_Q2() {
//		System.out.println("I am a SubClass");
//	}
}//class SubClass_Q2