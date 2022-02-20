package br.com.academia.capgemini.deafio3;

import javax.swing.JOptionPane;

public class Anagram {

	public static String DigitTheWord() {
		String word = "";
		while (word.length() <= 2) {
			word = JOptionPane.showInputDialog(null,
					"Digit the word, of minimum 6 character",
					"Calculating anagram", JOptionPane.INFORMATION_MESSAGE);
		}
		return word;
	}

	public static void Show(char[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println("");
	}
	
	public static String RemoveSpace(String word) {
		String alternating = "", internal = (word).trim();
		char c;

		for (int i = 0; i < internal.length(); i++) {
			c = internal.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				alternating += c;
			}
		}

		return alternating;
	}
	
	public static void CalculatingAnagram(char vector[], int k) {
		int i;
		if (k == vector.length - 1)
			Show(vector);
		else {
			CalculatingAnagram(vector, k + 1);
			i = k + 1;
			while (i < vector.length) {
				ChangePosition(vector, k, i);
				CalculatingAnagram(vector, k + 1);
				ChangePosition(vector, k, i);
				i = i + 1;
			}
		}
	}
	
	public static void ChangePosition(char[] vector, int k, int i) {
		char aux;
		aux = vector[i];
		vector[i] = vector[k];
		vector[k] = aux;
	}
	
	public static void WordBreak(String word, char vector[]) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = word.charAt(i);
		}
	}
}
