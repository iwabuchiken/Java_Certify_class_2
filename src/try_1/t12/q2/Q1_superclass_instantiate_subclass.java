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
package try_1.t12.q2;

/**
 * @author iwabuchiken
 *
 */
public class Q1_superclass_instantiate_subclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Singer	obj	= new Bird();
//		Bird		obj2	= new Singer();
		
		Bird		obj3	= (Bird)obj;
		
		/* method			*/
		obj.showMsg("i am a singer.");
//		obj.showNotice("Notice!");
		obj3.showNotice("Notice!");
//		(Bird)obj.showNotice("obj cast to Bird!");
		//=> 文ではありません。
		((Bird)obj).showNotice("obj cast to Bird!");
	}

}

class Singer {
	public void showMsg(String message) {
		System.out.println("message=" + message);
	}//showMsg()
}//class Singer

class Bird extends Singer {
	public void showNotice(String notice) {
		System.out.println("notice=" + notice);
	}//showNotice()
}//class Bird