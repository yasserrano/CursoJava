package com.li��es17;

import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double populacaoA;
		double populacaoB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;

		
		//popula��o A
		do {
			System.out.println("Entre com a popula��o A:");
			populacaoA = scan.nextDouble();
			
			if (populacaoA > 0) {
				valido = true;
				
			} else {
				System.out.println("Popula��o A precisa ser maior que 0");
				
			}
		
		} while (!valido);	
		
		
		//popula��o B
		valido = false;

		do {
			System.out.println("Entre com a popula��o B:");
			populacaoB = scan.nextDouble();
			
			if (populacaoB > 0) {
				valido = true;
				
			} else {
				System.out.println("Popula��o B precisa ser maior que 0");
				
			}
		
		} while (!valido);	
		
		
		//taxa A
		valido = false;

		do {
			System.out.println("Entre com a taxa de crecimento da popula��o A:");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
				
			} else {
				System.out.println("Taxa de crecimento A precisa ser maior que 0");
				
			}
		
		} while (!valido);	
		
		
		//taxa B
		valido = false;
		
		do {
			System.out.println("Entre com a taxa de crecimento da popula��o B:");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
				
			} else {
				System.out.println("Taxa de crecimento B precisa ser maior que 0");
				
			}
		
		} while (!valido);	
		
			
		int cont = 0;
		
		while (populacaoA < populacaoB) {
			
			populacaoA += (populacaoA/100) * taxaA;
			populacaoB += (populacaoB/100) * taxaB;
			cont++;
			
		}
		
		System.out.println("popula��o A: " + populacaoA);
		System.out.println("popula��o B: " + populacaoB);
		System.out.println("Quantidade de anos: " + cont);
		
	}		
	
}
