/************************************`
 * Q1_SameNameMember.java
 * Author: Iwabuchi Ken				*
 * Date: 20120308_174545
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.
 ************************************/
package try_1.t12.q1;

//import java.lang.*;
import java.io.*;

import mylib.STDLIB;

public class Q1_SameNameMember {

    public static void main(String[] args)
    {
    	/* Declare members */
    	SubClass		sub1		= new SubClass();
    	SubClass		sub2		= new SubClass();
    	
    	/* processes				*/
    	sub1.showMessage();
    	sub2.showMessage();
    	
    	/* set value				*/
    	sub1.setMessage(500);
    	
    	/* show again			*/
    	sub1.showMessage();
    	sub2.showMessage();
    	
    }//private static String get_project_path(String file_name)
}//public class Q1_SameNameMember {

class SuperClass {
	/* members			*/
	String message	= "I am SuperClass";
}//class SuperClass

class SubClass extends SuperClass {
	/* members			*/
	private int		message;
	
	/* constructor		*/
	SubClass() {
		this.message	= 300;
		System.out.println("A SubClass instance created");
		System.out.println("\tmessage=" + message);
	}
	
	/* show message	*/
	public void showMessage() {
//		System.out.println("\n");
		System.out.println("message=" + message);
		System.out.println("message from super=" + super.message);
	}//public void elemType showMessage( )

	/**
	 * @return the message
	 */
	public int getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(int message) {
		this.message = message;
	}
	
	
}//class SubClass extends SuperClass
