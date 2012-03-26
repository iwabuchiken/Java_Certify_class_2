/************************************`
 * Q21_Exception_FileNotFound.java
 * Author: iwabuchiken
 * Date: 20120322_141057
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
public class Q21_Exception_FileNotFound {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
//	public static void main(String[] args) throws FileNotFoundException {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		methodA("test.data");
	}
	
	public static void methodA(String fileName)
							throws FileNotFoundException {
		FileInputStream	f	= new FileInputStream(fileName);
	}//methodA()
}
