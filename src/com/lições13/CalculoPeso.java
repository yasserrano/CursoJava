package com.lições13;

import java.util.Scanner;

public class CalculoPeso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Entre com o peso: ");
		int peso = entrada.nextInt();
		
		double imc = peso/(altura*altura);
		System.out.println ("Resultado do calculo IMC : " + imc + "\n");
			
	}

}
