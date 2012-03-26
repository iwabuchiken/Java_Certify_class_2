/************************************`
 * Q17_generics.java
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
package try_1.t12.q3;

import java.util.ArrayList;

/**
 * @author iwabuchiken
 *
 */
public class Q17_generics {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String>	list	= new ArrayList<String>();
//		ArrayList				list	= new ArrayList();
		String					str;
		
		list.add("Mon");
		list.add("Tue");
		str		= list.get(0);
		
		System.out.println("str=" + str);
		
	}
}
