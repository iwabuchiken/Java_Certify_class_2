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

/*
<applet code="Calc.class" width="200" height="170"></applet>
 */

//package try_1.t12.q8;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author iwabuchiken
 *
 */

public class Calc extends Applet implements ActionListener{

	/**
	 * @param args
	 */
	Button[]	num		= new Button[10];
	Button		plus		= new Button("+");
	Button		clear		= new Button("Clear");
	TextField	display	= new TextField(10);
	Panel		displayPanel		= new Panel();
	Panel		numPanel			= new Panel();
//	int			result;
	int			result = 0;
	boolean	flag		= false;
	
	/* init()			*/
	public void init() {
		setSize(200, 170);
//		setSize(400, 170);
		add(new Label("Calculator"));
		setLayout(new BorderLayout());
		displayPanel.add(display);
		displayPanel.add(plus);
		displayPanel.add(clear);
		
		/* the number buttons			*/
		numPanel.setLayout(new GridLayout(4, 3, 3, 3));
		for (int i = 9; i >= 0; i--) {
			num[i] = new Button(Integer.toString(i));
			num[i].addActionListener(this);
			numPanel.add(num[i]);
		}//for (int i = 0; i < i >= 0.length; i++)
		plus.addActionListener(this);
		clear.addActionListener(this);
		add(displayPanel, BorderLayout.NORTH);
		add(numPanel, BorderLayout.CENTER);
	}//init()
	
	public  void actionPerformed(ActionEvent e) {
		String		label		= e.getActionCommand();
		//debug
//		System.out.println("label=" + label);
		if ("+".equals(label)) {
			result += Integer.parseInt(display.getText());
			display.setText(Integer.toString(result));
			flag = true;
		} else if ("Clear".equals(label)) {
			result = 0;
			display.setText("");
		} else {
			if (flag) {
				display.setText("");
				flag = false;
			}//if (flag)
			display.setText(display.getText() + label);
		}//if ("+".equals(label))
		
	}//action()
	
}//class TestMember
