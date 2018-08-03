package BASICS;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FacebookInformationFrame {
	int count=0;
	public FacebookInformationFrame(){
		
	}

	public FacebookInformationFrame(String []str){
		JFrame mainFrame=new JFrame();
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new FlowLayout());
		JLabel firstName,surname,email,loginPassword,newEmail,reEnteredEmail,newPassword,day,month,year,gender,birthday;
		email=new JLabel("Login email address is : "+str[0]);
		loginPassword= new JLabel("Login password is : "+str[1]);
		firstName=new JLabel("First Name is : "+str[2]);
		surname=new JLabel("Surname is : "+str[3]);
		newEmail=new JLabel("New entered Email address : "+str[4]);
		reEnteredEmail=new JLabel("Re-entered Email address : "+ str[5]);
		newPassword=new JLabel("New entered password : "+str[6]);
		birthday=new JLabel("Birthday is : "+str[7]+"/"+str[8]+"/"+str[9]);
		mainFrame.add(email);
		mainFrame.add(loginPassword);
		mainFrame.add(firstName);
		mainFrame.add(surname);
		mainFrame.add(newEmail);
		mainFrame.add(reEnteredEmail);
		mainFrame.add(newPassword);
		mainFrame.add(birthday);
		
		mainFrame.setVisible(true);
		
		
		//email.setText("Login email address is  "+str[0]);
	}
	
	public void getInformation(String []str){
		JFrame mainFrame=new JFrame();
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new FlowLayout());
		JLabel firstName,surname,email,loginPassword,newEmail,reEnteredEmail,newPassword,day,month,year,gender,birthday;
		email=new JLabel("Login email address is : "+str[0]);
		loginPassword= new JLabel("Login password is : "+str[1]);
		firstName=new JLabel("First Name is : "+str[2]);
		surname=new JLabel("Surname is : "+str[3]);
		newEmail=new JLabel("New entered Email address : "+str[4]);
		reEnteredEmail=new JLabel("Re-entered Email address : "+ str[5]);
		newPassword=new JLabel("New entered password : "+str[6]);
		birthday=new JLabel("Birthday is : "+str[7]+"/"+str[8]+"/"+str[9]);
		mainFrame.add(email);
		mainFrame.add(loginPassword);
		mainFrame.add(firstName);
		mainFrame.add(surname);
		mainFrame.add(newEmail);
		mainFrame.add(reEnteredEmail);
		mainFrame.add(newPassword);
		mainFrame.add(birthday);
		count +=1;
		mainFrame.setVisible(true);
		
		
	}
}
