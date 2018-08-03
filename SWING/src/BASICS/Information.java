package BASICS;

import javax.swing.JLabel;

public class Information {
	private String firstName, surName, email, loginPassword, newEmail, reEnteredEmail, newPassword, birthday, age;

	public Information(String email, String loginPassword, String firstName, String surName, String newEmail,
			String reEnteredEmail, String newPassword, String birthday, String age) {
		this.email = email;
		this.loginPassword = loginPassword;
		this.firstName = firstName;
		this.surName = surName;
		this.newEmail = newEmail;
		this.reEnteredEmail = reEnteredEmail;
		this.newPassword = newPassword;
		this.birthday = birthday;
		this.age = age;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getNewEmail() {
		return newEmail;
	}

	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}

	public String getReEnteredEmail() {
		return reEnteredEmail;
	}

	public void setReEnteredEmail(String reEnteredEmail) {
		this.reEnteredEmail = reEnteredEmail;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Information [firstName=" + firstName + ", surName=" + surName + ", email=" + email + ", loginPassword="
				+ loginPassword + ", newEmail=" + newEmail + ", reEnteredEmail=" + reEnteredEmail + ", newPassword="
				+ newPassword + ", birthday=" + birthday + ", age=" + age + "]";
	}
	

}
