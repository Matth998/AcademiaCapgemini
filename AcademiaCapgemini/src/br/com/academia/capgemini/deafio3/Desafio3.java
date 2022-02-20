package br.com.academia.capgemini.deafio3;

public class Desafio3 {

	public static void main(String[] args) {

		String word = Anagram.DigitTheWord();
		char vector[];
		
		word = Anagram.RemoveSpace(word);

		vector = new char[word.length()];

		Anagram.WordBreak(word, vector);

		Anagram.CalculatingAnagram(vector, 0);

		System.exit(0);
	}

}

