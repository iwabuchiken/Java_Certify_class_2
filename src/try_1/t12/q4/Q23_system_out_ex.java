/************************************`
 * Q23_system_out_ex.java
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
public class Q23_system_out_ex {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
//	public static void main(String[] args) throws FileNotFoundException {
	public static void main(String[] args) {
		try {
			String str = "Java";
			int i = Integer.parseInt(str);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage() + "\n");
			e.printStackTrace();
		}
	}
}
