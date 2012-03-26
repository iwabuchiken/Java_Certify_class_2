/************************************`
 * Q18_cast_to_child.java
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
public class Q18_cast_to_child {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ParentQ18	p;
		ChildQ18		c;
		p		= new ChildQ18();
		
		/* show type			*/
		System.out.println(p.getClass().getName());
		
		/* c			*/
		c		= (ChildQ18)new ParentQ18();
		
		/* show type			*/
		System.out.println(c.getClass().getName());
		
	}
}

class ParentQ18 {}

class ChildQ18 extends ParentQ18 {}
