package com.li��es17;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		int populacaoA = 80000;
		int populacaoB = 200000;
		int cont = 0;
		
		while (populacaoA < populacaoB) {
			
			populacaoA += (populacaoA/100) * 3;
			populacaoB += (populacaoB/100) * 1.5;
			cont++;
			
		}
		
		System.out.println("popula��o A: " + populacaoA);
		System.out.println("popula��o B: " + populacaoB);
		System.out.println("Qusmtidade de anos: " + cont);

	
		
	}		
	
}
