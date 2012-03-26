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
package try_1.t12.q4;

/**
 * @author iwabuchiken
 *
 */
public class Q20_NumberFormatException {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String		str		= "Java";
		
		try {
			int i = Integer.parseInt(str);
//		} catch (Exception e) {
			
		} catch (NumberFormatException e) {
			System.out.println(1);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(2);
		}
	}
}
