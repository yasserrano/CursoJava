package com.li��es17;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {

	
		Scanner scan = new Scanner (System.in);
		
		boolean notaValida = false;
		
		do {
			
			System.out.println("Entre com uma nota");
			
			int nota = scan.nextInt();
			
			if (nota >=0 && nota <= 10) {
				notaValida = true;
				System.out.println("Nota:" + nota);
				
			} else {
				System.out.println("Nota inv�lida, digite novamente.");
				
			}
			
		} while (!notaValida);
		
		
		
		
	}		
	
}
