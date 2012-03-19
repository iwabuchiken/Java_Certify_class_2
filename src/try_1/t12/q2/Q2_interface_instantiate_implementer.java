/************************************`
 * Q2_interface_instantiate_implementer.java
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
public class Q2_interface_instantiate_implementer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Singer_Inter	obj1	= new Bird_Q2();
		
		/* method				*/
		obj1.showMsg("i am a Singer_Inter instance");

	}

}

interface Singer_Inter {
//	void showMsg(String message);
	void showMsg(String message);
//	}//showMsg()
}//class Singer

class Bird_Q2 implements Singer_Inter {
//class Bird_Q2 {
	public void showMsg(String message) {
		System.out.println("message=" + message);
	}//showNotice()
}//class Bird