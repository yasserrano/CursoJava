package com.li��es;

import java.util.Scanner;

public class RaioQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o tamanho do lado do quadrado: ");
		
		double lado = scan.nextDouble();
		
		//area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado �: " + area);
		System.out.println("O dobro da area do quadrado �: " + (area *2));
		
		
	}

}
