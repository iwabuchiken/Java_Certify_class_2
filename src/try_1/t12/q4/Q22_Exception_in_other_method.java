/************************************`
 * Q22_Exception_in_other_method.java
 * Author: iwabuchiken
 * Date: 20120323_091436
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
package try_1.t12.q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author iwabuchiken
 *
 */
public class Q22_Exception_in_other_method {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
//	public static void main(String[] args) throws FileNotFoundException {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			// TODO 自動生成されたメソッド・スタブ
			methodA();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(1);
		}
	}
	
	public static void methodA() {
		try {
			methodB(3, 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//methodA()
	
	public static void methodB(int n1, int n2) {
		try {
			int result = n1 / n2;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println(3);
		}
	}//methodB()
}
