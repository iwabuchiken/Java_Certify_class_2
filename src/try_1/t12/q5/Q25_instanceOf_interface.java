/************************************`
 * Sub1_value_of_inputCnt.java
 * Author: iwabuchiken
 * Date: 20120320_101940
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
package try_1.t12.q5;

/**
 * @author iwabuchiken
 *
 */

interface In {}//interface in

class A {}

class B extends A implements In {}

public class Q25_instanceOf_interface {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		B	objB	= new B();
		System.out.print( objB instanceof A );
		System.out.print( "   " );
		System.out.println( objB instanceof In);
	}
}
