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
package try_1.t12.q8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

//import org.apache.commons.lang.*;

import mylib.STDLIB;

/**
 * @author iwabuchiken
 *
 */

public class TestMember {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		BufferedReader		reader		= null;
		MemberList				list			= new MemberList();
		String						line;
		String						file_path;		/* file project path for "point.csv"	*/
		String						file_name = "point.csv";		/* csv file			*/
		
		/* set value			*/
		file_path = STDLIB.get_project_path_to_file(
										new TestMember(), file_name);
		
		try {
//			reader = new BufferedReader(new FileReader("point.csv"));
			reader = new BufferedReader(new FileReader(file_path));
			while ((line = reader.readLine()) != null) {
				list.createMember(line);
			}
			for (Member member : list) {
				member.update();
				System.out.println(member.toString());
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
				e.printStackTrace();
			}
		}//try
//		
		//debug
//		{
//			String		string;
////			STDLIB.get_project_path(root_name, target_name, package_name)
//			System.out.println(STDLIB.get_file_name());
//			System.out.println(STDLIB.get_file_absolute_path(STDLIB.get_file_name()));
//			
//			string = STDLIB.get_package_name(new TestMember());
//			System.out.println(string);
////			System.out.println(STDLIB.get_package_name(new TestMember()));
//			
//			string = STDLIB.substitute_chars(string, '.', '\\');
//			System.out.println(string);
//			
//			/* get project path			*/
//			string = STDLIB.get_project_path(new TestMember());
//			System.out.println("string=" + string);
//			
//			/* get the project path for a given file		*/
//			string = String.format("%s%s%s", 
//					STDLIB.get_project_path(new TestMember()), 
//					File.separator, "point.csv");
//			System.out.println(string);
//			
//			/* get the path using a STDLIB method		*/
//			System.out.println(
//					STDLIB.get_project_path_to_file(new TestMember(), "point.csv"));
//		}//debug
	}//public static void main(String[] args)
}//class TestMember

class MemberList extends ArrayList<Member> {
	void createMember(String line) {
		int			no, point;
		String		name;
		
		StringTokenizer	st	= new StringTokenizer(line, ",");
		while (st.hasMoreTokens()) {
			no		= Integer.parseInt(st.nextToken());
			name	= st.nextToken();
			point		= Integer.parseInt(st.nextToken());
			add(new Member(no, name, point));
		}//while (st.hasMoreTokens())
	}//createMember()
}//class MemberList extends ArrayList<Member>

class Member {
	private		int	no;
	private		String	name;
	private		int	point;
	private		int ticket;
	
	Member(int no, String name, int point) {
		this.no = no;
		this.name = name;
		this.point = point;
	}
	
	public String toString() {
		return no + " " + name + ": Issue " + ticket
				+ " pieces. Remain: " + point;
	}//toString()
	
	public void update() {
		ticket	+= point / 100;
		point = point % 100;
	}//update()
	
}//class Member