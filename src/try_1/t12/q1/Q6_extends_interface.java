/************************************`
 * Q6_extends_interface.java
 * Author: iwabuchiken
 * Date: 2012/2012/03/15/17:00:58
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
package try_1.t12.q1;

/**
 * @author iwabuchiken
 *
 */
public class Q6_extends_interface {

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		AClass_Q6	class1	= new AClass_Q6();
//	}

}

interface Inter1 {
	public abstract void showMessage();
}

interface Inter2 extends Inter1{
	public abstract void showMessage2();//public void elemType showMessage2( )
}

class AClass_Q6 implements Inter2 {

	/* (非 Javadoc)
	 * @see try_1.t12.q1.Inter2#showMessage2()
	 */
	@Override
	public void showMessage2() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	/* (非 Javadoc)
	 * @see try_1.t12.q1.Inter1#showMessage()
	 */
	@Override
	public void showMessage() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}//class AClass_Q6