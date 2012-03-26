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
package try_1.t12.q3;

/**
 * @author iwabuchiken
 *
 */
public class Q19_constructor_super {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		ParentQ19	p;
		ChildQ19		c	= new ChildQ19();
//		p		= new ChildQ19();
		
		/* show type			*/
//		System.out.println(p.getClass().getName());
		
		/* c			*/
//		c		= (ChildQ19)new ParentQ19();
		
		/* show type			*/
//		System.out.println(c.getClass().getName());
		
	}
}

class ParentQ19 {
	ParentQ19() {
		System.out.println("ParentQ19");
	}
}

class ChildQ19 extends ParentQ19 {
	ChildQ19() {
		super();
		System.out.println("ChildQ19");
//		super();
	}
}
