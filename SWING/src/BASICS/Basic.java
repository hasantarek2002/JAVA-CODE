package BASICS;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javafx.scene.control.ComboBox;

public class Basic {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("Facebook");
		f.setSize(500, 500);
		
		String []month={"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
		String []day={"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String []year={"Year","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
		
		JLabel l1,l2,l3;
		JTextField t1;
		JComboBox cmb1,cmb2,cmb3;
		
		l1 = new JLabel("Email or Phone");
	    l1.setBounds(10,10, 200,30);
	    
	    
	    t1=new JTextField("");  
	   t1.setBounds(10,35,200, 30);  
	    
	    l2 = new JLabel("Password");
	    l2.setBounds(250, 10, 200, 30);
	    JPasswordField t2 = new JPasswordField();
	    t2.setBounds(250,35, 200,30);
	    
	    JButton button=new JButton("Log in");
	    button.setBounds(450, 43,100, 20);
	    
	    l3=new JLabel("Birthday");
	    l3.setBounds(10, 70, 50,40);
	    
	    cmb1= new JComboBox(day);
	    cmb1.setBounds(10, 110, 50, 30);
	    
	    cmb2= new JComboBox(month);
	    cmb2.setBounds(62, 110, 85, 30);
	    
	    cmb3= new JComboBox(year);
	    cmb3.setBounds(147, 110, 80, 30);
	    
	    JRadioButton r1=new JRadioButton("Male");    
	    JRadioButton r2=new JRadioButton("Female");
	    
	    r1.setBounds(10,170,60,30);    
	    r2.setBounds(80,170,80,30);    
	    ButtonGroup bg=new ButtonGroup();    
	    bg.add(r1);
	    bg.add(r2);
	    
	    JButton button2=new JButton("Create Account");
	    button2.setBounds(10, 220,130, 20);
	    
//	    JTextField a= new JTextField("aaaaa");
//	    a.setBounds(10, 300, 100, 30);
//	    a.setInheritsPopupMenu(true);
	    
	    
	    
			
		
	    f.add(l1);
	    f.add(t1); 
	    f.add(l2);
	    f.add(t2);
	    f.add(button);
	    f.add(l3);
	    f.add(cmb1);
	    f.add(cmb2);
	    f.add(cmb3);
	    f.add(r1);
	    f.add(r2);
	    f.add(button2);
	    //f.add(a);
	    
	    f.setLayout(null);  	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	

}
