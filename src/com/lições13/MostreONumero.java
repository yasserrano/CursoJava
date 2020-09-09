package com.lições13;

import java.util.Scanner;

public class MostreONumero {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um numero inteiro: ");
		int numero = scan.nextInt();
		System.out.println("O numero informado foi: " + numero);
	}

}
