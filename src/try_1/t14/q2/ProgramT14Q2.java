/************************************`
 * ProgramT14Q2.java
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
package try_1.t14.q2;

/**
 * @author iwabuchiken
 *
 */
public class ProgramT14Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* vars			*/
		Se		liu				= new Se("Liu");
		Sales	corazon	= new Sales("Corazon");
		
		/* processes	*/
		start(liu);
		start(corazon);
	}
	
	public static void start(Employee obj) {
//	public static void start(Object obj) {
		obj.work();
//		((Employee)obj).work();
	}//start()

}

interface Worker {
	void work();
}//interface Worker

abstract class Employee implements Worker {
	String		name;
	Employee(String name) {
		this.name		= name;
	}
}//class Employee implements Worker

class Se extends Employee {
	Se(String name) {
		super(name);
	}
	public  void work() {
		System.out.println(name + " programs.");
	}//work()
}//class Se extends Employee

class Sales extends Employee {
	Sales(String name) {
		super(name);
	}
	public  void work() {
		System.out.println(name + " sells.");
	}//work()
}//class Sales extends Employee