package com.lições17;

import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	boolean info = false;
	String nome;
	int idade;
	double salario;
	String sexo;
	String estadoCivil;
	
	
	// nome
	do {
		System.out.println("Entre com o nome: ");
		nome = scan.next();
		
		if (nome.length() >= 3) {
			info = true;
				
		} else {
			System.out.println("Nome precisa no minimo 3 carcateres");
			
		}
			
		} while (!info);
	
	
	// idade	
		info = false;
		do {
			System.out.println("Entre com o idade: ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				info = true;
					
			} else {
				System.out.println("Idade precisa ser entre 0 e 150");
				
			}
				
			} while (!info);
		
		
	// salario	
		info = false;
		do {
			System.out.println("Entre com o salario: ");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				info = true;
					
			} else {
				System.out.println("Idade precisa ser maior que 0.");
				
			}
				
			} while (!info);
		
		
	// sexo	
		info = false;
		do {
			System.out.println("Entre com o sexo: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				info = true;
					
			} else {
				System.out.println("Sexo precisa ser 'f' ou 'm'");
				
			}
				
			} while (!info);
		
		
	//estado civil
		info = false;
		do {
			System.out.println("Entre com o estado civil: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") ||
					 estadoCivil.equalsIgnoreCase("c") ||
						 estadoCivil.equalsIgnoreCase("v") ||
							 estadoCivil.equalsIgnoreCase("d")) {
				info = true;
					
			} else {
				System.out.println("Estado civil precisa ser 's' , 'c' , 'v' ou 'd'");
				
			}
				
			} while (!info);
		
			System.out.println("As seguintes informações foram coletadas: ");
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Salario " + salario);
			System.out.println("Sexo: " + sexo);
			System.out.println("Estado Civil: " + estadoCivil);
		
	   	
	}		
	
}
