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
package try_1.t12.q6;

/**
 * @author iwabuchiken
 *
 */

interface In {}//interface in

class A {}

class B extends A implements In {}

public class Sub1_value_of_inputCnt {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int		inputCnt;
		int		i	= 0;
		
//		System.out.println("inputCnt=" + inputCnt);
		System.out.println(i == inputCnt);
	}
}
