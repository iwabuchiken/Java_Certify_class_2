/************************************`
 * Q5_private_member_of_super_class.java
 * Author: iwabuchiken
 * Date: 2012/2012/03/15/16:04:18
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
public class Q5_private_member_of_super_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* members			*/
		SubClass_Q5	sub1	= new SubClass_Q5();
	}

}

class SuperClass_Q5 {
	private	String	name	= "SuperClass, private";
	static	String	name2	= "SuperClass, no access designator, static";
	String	name3	= "SuperClass, no access designator, non-static";
	
}//class SuperClass_Q5

class SubClass_Q5 extends SuperClass_Q5{
	/* constructor		*/
	SubClass_Q5() {
		System.out.println("I am a SubClass_Q5");
//		System.out.println("name is " + super.name);
		System.out.println("name is " + super.name2);
		System.out.println("name is " + super.name3);
	}
}//class SubClass_Q5