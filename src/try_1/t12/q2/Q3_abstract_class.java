/************************************`
 * Q3_abstract_class.java
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
package try_1.t12.q2;

/**
 * @author iwabuchiken
 *
 */
public class Q3_abstract_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sub_Q3	obj1	= new Sub_Q3();
		
		/* show			*/
		obj1.showMsg("i am a Sub_Q3 instance");
		obj1.showMsg("Another message");
		obj1.showNotice("Notice!");

	}

}

abstract class Super_Q3 {
//class Super_Q3 {
	abstract void showMsg(String message);
	
	public  void showNotice(String notice) {
		System.out.println("notice: " + notice);
	}//showNotice()

}//class Super_Q3

class Sub_Q3 extends Super_Q3 {
	void showMsg(String message) {
		System.out.println("message=" + message);
	}
}//