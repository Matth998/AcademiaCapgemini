package br.com.academia.capgemini.deafio2;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		String password;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Check if it meets the requirements"
				+ "\nIt has at least 6 characters.\r\n"
				+ "\nContains at least 1 digit.\r\n"
				+ "\nContains at least 1 letter in.\r\n"
				+ "\nContains at least 1 capital letter.\r\n"
				+ "\nContains at least 1 special character. The special characters are: !@#$%^&*()-+");
		System.out.println();
		System.out.println("Type your password");
		password = input.next();
		
		ValidatePassword.passwordValidated(password);
		
		input.close();
		
	}
	
}
