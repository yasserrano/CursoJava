package com.lições17;

import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double populacaoA;
		double populacaoB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;

		
		//população A
		do {
			System.out.println("Entre com a população A:");
			populacaoA = scan.nextDouble();
			
			if (populacaoA > 0) {
				valido = true;
				
			} else {
				System.out.println("População A precisa ser maior que 0");
				
			}
		
		} while (!valido);	
		
		
		//população B
		valido = false;

		do {
			System.out.println("Entre com a população B:");
			populacaoB = scan.nextDouble();
			
			if (populacaoB > 0) {
				valido = true;
				
			} else {
				System.out.println("População B precisa ser maior que 0");
				
			}
		
		} while (!valido);	
		
		
		//taxa A
		valido = false;

		do {
			System.out.println("Entre com a taxa de crecimento da população A:");
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
			System.out.println("Entre com a taxa de crecimento da população B:");
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
		
		System.out.println("população A: " + populacaoA);
		System.out.println("população B: " + populacaoB);
		System.out.println("Quantidade de anos: " + cont);
		
	}		
	
}
