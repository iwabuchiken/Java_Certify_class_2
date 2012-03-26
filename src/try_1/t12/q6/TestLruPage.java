/************************************`
 * TestMember.java
 * Author: iwabuchiken
 * Date: 20120324_205108
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
package try_1.t12.q6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 * @author iwabuchiken
 *
 */

public class TestLruPage {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
			// TODO 自動生成されたメソッド・スタブ
			
			//debug
//			System.out.println("Creating an instance...");
//			System.out.println("args.length=" + args.length);
//			if (args.length > 0) {
//				System.out.println("args[0]=" + args[0]);
//			} else {
//				System.out.println("No argument");
//			}//if (args.length > 0)
//			System.out.println("args[0]=" + args[0]);
//			System.out.println("Integer.parseInt(0)=" + Integer.parseInt(0));
//			System.out.println("Integer.parseInt(args[0])=" + Integer.parseInt(args[0]));
			
			LruPage obj = new LruPage(Integer.parseInt(args[0]));
			
			//debug
			System.out.println("LruPage object created");
			
			BufferedReader in = new BufferedReader(
								new InputStreamReader(System.in));
			
			//debug
//			System.out.println("'while' loop starts");
			
			while (true) {
				System.out.print("Input an integer: ");
				String	input		= in.readLine();
				if (input.equals("")) {
					break;
				}//if (input.equals(""))
				int		num		= Integer.parseInt(input);
				obj.setPage(num);
			}//while (true)
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error");
		}
	}
}

class LruPage {
	private int[]		pages, status;
	private int		pageCnt, inputCnt;
	
	LruPage(int pageCnt) {
		pages		= new int[pageCnt];
		status		= new int[pageCnt];
		this.pageCnt	= pageCnt;
		
		//debug
		System.out.println("An instance created");
	}
	
	void setPage(int value) {
		boolean	flag	= false;
		
		//debug
		System.out.println("inputCnt=" + inputCnt);
		
		for (int i = 0; i < inputCnt; i++) {
			if (flag = chkData(i, value)) break;
		}//for (int i = 0; i < array.length; i++)
		
		if (flag == false) {
			if (inputCnt == pageCnt) {
				for (int i = 0; i < inputCnt; i++) {
					if (driveOut(i, value)) break;
						
					//if (driveOut(i, value))
				}//for (int i = 0; i < inputCnt; i++)
			} else {
				pages[inputCnt] = value;
				for (int i = 0; i < inputCnt; i++) {
					status[i]++;
				}//for (int i = 0; i < array.length; i++)
				status[inputCnt] = 1;
				inputCnt++;
			}//if (inputCnt == pageCnt)
		}//if (flag == false)
		display();
	}//setPage()
	
	boolean chkData(int i, int value) {
		boolean		flag	= false;
		
		if (pages[i] == value) {
			int work = status[i];
			if (work != 1) {
				for (int j = 0; j < inputCnt; j++)
					if (status[j] < work && i != j) {
						status[j]++;
					}//if (status[j] < work && i != j)
				//for (int j = 0; j < inputCnt.length; j++)
				status[i] = 1;
			}//if (work != 1)
			flag = true;
		}//if (pages[i] == value)
		
		return flag;
	}//chkData()
	
	void display() {
		for (int i = 0; i < status.length; i++) {
			System.out.print("\t" + status[i]);			
		}//for (int i = 0; i < array.length; i++)
		System.out.println();
		
		for (int i = 0; i < pages.length; i++) {
			System.out.print("\t" + pages[i]);			
		}//for (int i = 0; i < pages.length; i++)
		System.out.println();
		
	}//display()
	
	boolean driveOut(int i, int value) {
		boolean	flag = false;
		if (status[i] == pageCnt) {
			for (int j = 0; j < inputCnt; j++) {
				if (status[j] != inputCnt && i != j) {
					status[j]++;
				}//if (status[j] != inputCnt && i != j)
			}//for (int j = 0; j < inputCnt; j++)
			pages[i] = value;
			status[i] = 1;
			flag = true;
		}//if (status[i] == pageCnt)
		return flag;
	}//driveOut()
	
}//class LruPage