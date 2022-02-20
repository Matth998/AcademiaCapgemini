package br.com.academia.capgemini.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		List<String> steps = new ArrayList<>();

		 

		System.out.print("Enter how many steps you want: ");
		int qtdSteps = input.nextInt();

		 

		for (int i = 0; i < qtdSteps; i++) {
			steps.add(" ".repeat(qtdSteps - i) + "*".repeat(i + 1));
		}

		 

		for (String s : steps ) {
		System.out.println(s);
		}

		input.close();
		
	}
}
