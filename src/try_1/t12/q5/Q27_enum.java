/************************************`
 * Q27_enum.java
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
package try_1.t12.q5;

/**
 * @author iwabuchiken
 *
 */

enum Admission {
	ADULT(1200), STUDENT(700), CHILD(400);
	private		int	fee;
	Admission(int fee) {
		this.fee = fee;
	}
	
	int getFee() {
		return fee;
	}//getFee()
}//enum Admission

public class Q27_enum {

	/**
	 * @param args
	 */
	Admission		fee;
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Q27_enum		ad		= new Q27_enum();
		ad.fee			= Admission.ADULT;
//		ad.fee			= 6000;			//=> �^�̕s��v: int ���� Admission �ɂ͕ϊ��ł��܂���
//		ad.fee			= new Admission();
		System.out.println("Adult: " + ad.fee.getFee() + " Yen");
	}
}
