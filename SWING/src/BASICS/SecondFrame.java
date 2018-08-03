package BASICS;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SecondFrame {

	public static int count = 0;
	public static HashMap<String, Information> map = new HashMap<String, Information>();
	// String []information=new String[100];
	public static String[][] information2 = new String[10][9];
	String columName[] = { "firstName", "surname", "email", "loginPassword", "newEmail", "reEnteredEmail",
			"newPassword", "Birthady", "Age" };

	public void getSecondFrame(String[] str) {

		JFrame mainFrame = new JFrame();
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new FlowLayout());
		JLabel firstName, surname, email, loginPassword, newEmail, reEnteredEmail, newPassword, day, month, year,
				gender, birthday, age;
		email = new JLabel(str[0]);
		loginPassword = new JLabel(str[1]);
		firstName = new JLabel(str[2]);
		surname = new JLabel(str[3]);
		newEmail = new JLabel(str[4]);
		reEnteredEmail = new JLabel(str[5]);
		newPassword = new JLabel(str[6]);
		birthday = new JLabel(str[7] + "/" + str[8] + "/" + str[9]);
		age = new JLabel(str[10]);
		// email = new JLabel("Login email address is : " + str[0]);
		// loginPassword = new JLabel("Login password is : " + str[1]);
		// firstName = new JLabel("First Name is : " + str[2]);
		// surname = new JLabel("Surname is : " + str[3]);
		// newEmail = new JLabel("New entered Email address : " + str[4]);
		// reEnteredEmail = new JLabel("Re-entered Email address : " + str[5]);
		// newPassword = new JLabel("New entered password : " + str[6]);
		// birthday = new JLabel("Birthday is : " + str[7] + "/" + str[8] + "/"
		// + str[9]);
		// information[count]=+" "+loginPassword.getText()+"
		// "+firstName.getText()+" "+surname.getText()+" "+newEmail.getText()+"
		// "+reEnteredEmail.getText()+" "+newPassword.getText()+"
		// "+birthday.getText();

		// information2[count][0] = firstName.getText();
		// // information2 [count][1]=loginPassword.getText();
		// information2[count][1] = surname.getText();
		// information2[count][2] = email.getText();
		// // information2 [count][3]=surname.getText();
		// information2[count][3] = loginPassword.getText();
		// information2[count][4] = newEmail.getText();
		// information2[count][5] = reEnteredEmail.getText();
		// information2[count][6] = newPassword.getText();
		// information2[count][7] = birthday.getText();
		// information2[count][8] = age.getText();

		count += 1;

		Information info = new Information(email.getText(), loginPassword.getText(), firstName.getText(),
				surname.getText(), newEmail.getText(), reEnteredEmail.getText(), newPassword.getText(),
				birthday.getText(), age.getText());
		// mainFrame.add(sp);

		information2[count][0] = info.getFirstName(); // firstName.getText();
		// information2 [count][1]=loginPassword.getText();
		information2[count][1] = info.getSurName(); // surname.getText();
		information2[count][2] = info.getEmail(); // email.getText();
		// information2 [count][3]=surname.getText();
		information2[count][3] = info.getLoginPassword(); // loginPassword.getText();
		information2[count][4] = info.getNewEmail(); // newEmail.getText();
		information2[count][5] = info.getReEnteredEmail(); // reEnteredEmail.getText();
		information2[count][6] = info.getNewPassword(); // newPassword.getText();
		information2[count][7] = info.getBirthday(); // birthday.getText();
		information2[count][8] = info.getAge(); // age.getText();

		map.put(info.getEmail(), info);

//		mainFrame.add(email);
//		mainFrame.add(loginPassword);
//		mainFrame.add(firstName);
//		mainFrame.add(surname);
//		mainFrame.add(newEmail);
//		mainFrame.add(reEnteredEmail);
//		mainFrame.add(newPassword);
//		mainFrame.add(birthday);
//		mainFrame.add(age);

		// mainFrame.add(t);

		mainFrame.setVisible(true);
		JButton clickButton = new JButton("Create a new account");
		JButton showButton = new JButton("show all");
		clickButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				mainFrame.setVisible(false);
				FirstFrame f1 = new FirstFrame();
				f1.getFirstFrame();

			}
		});

		showButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTable jt = new JTable(information2, columName);
				jt.setBounds(50, 40, 100, 200);
				// jt.setBounds(30, 30, 300, 300);
				for (String key : map.keySet()) {
					Information value = map.get(key);
					System.out.println(key + " -> " + value);
				}
				for (int i = 0; i < count; i++) {
					jt.addRowSelectionInterval(i, count);
					JScrollPane sp = new JScrollPane(jt);
					mainFrame.add(sp);
				}

				mainFrame.setVisible(true);

			}
		});
		mainFrame.add(clickButton);
		mainFrame.add(showButton);

		// email.setText("Login email address is "+str[0]);
	}

}
