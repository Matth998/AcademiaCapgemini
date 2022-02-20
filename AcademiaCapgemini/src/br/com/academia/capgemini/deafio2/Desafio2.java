package br.com.academia.capgemini.deafio2;

import javax.swing.JOptionPane;

public class Desafio2 {

	public static void main(String[] args) {
		
		String password;
		String User;
		
		User = JOptionPane.showInputDialog(null,
				"Type your username",
				"Username", JOptionPane.INFORMATION_MESSAGE);
		
		password = JOptionPane.showInputDialog(null,
				"Type your password, of minimum 6 character, 1 digit, 1 letter in, 1 capital letter, 1 special character.",
				"Password", JOptionPane.INFORMATION_MESSAGE);
		
		ValidatePassword.passwordValidated(password);
		
	}
	
}
