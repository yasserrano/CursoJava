package com.li��es15;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora: ");
		float valorHora = scan.nextFloat();
		
		System.out.println("Entre com as horas trabalhadas no m�s: ");
		float qtdHoras = scan.nextFloat();
		
		float salarioBruto = valorHora * qtdHoras;
		float inss = (salarioBruto / 100) * 8;
		float irff = (float) ((salarioBruto / 100) * 7.5);
		float fgts = (salarioBruto / 100) * 8;
		float totalDescontos = inss + irff + fgts;
		float salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("O sal�rio bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("IRFF: " + irff);
		System.out.println("FGTS: " + fgts);
		System.out.println("total Descontos: " + totalDescontos);
		System.out.println("Sal�rio l�quido: " + salarioLiquido);
	
	}

}
