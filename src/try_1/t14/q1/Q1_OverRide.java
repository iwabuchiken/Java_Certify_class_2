/************************************`
 * Q1_superclass_instantiate_subclass.java
 * Author: iwabuchiken
 * Date: 2012/2012/03/16/8:25:16
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
package try_1.t14.q1;

/**
 * @author iwabuchiken
 *
 */
public class Q1_OverRide {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SubClassQ1	sub1	= new SubClassQ1();
		
		sub1.showMessage("I am an instance of SubClassQ1");
		sub1.showMessage(300);
	}

}

class SuperClassQ1 {
	public void showMessage(String message) {
		System.out.println("SuperClassQ1: showMessage(String message)");
//		System.out.println("SuperClassQ1: showMessage()");
		System.out.println("message is: " + message);
	}//showMessage()
}//class SuperClassQ1

class SubClassQ1 extends SuperClassQ1 {
	public void showMessage(int message) {
		System.out.println("SubClassQ1: showMessage(int message)");
//		System.out.println("SubClassQ1: showMessage()");
		System.out.println("message is: " + message);
	}//showMessage()
}//class SubClassQ1
