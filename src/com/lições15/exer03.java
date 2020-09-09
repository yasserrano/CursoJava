package com.lições15;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra (F ou M): ");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("feminino");
			
		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("masculino");
			
		} else {
			System.out.println("Sexo inválido");
			
		}
		
	}

}
