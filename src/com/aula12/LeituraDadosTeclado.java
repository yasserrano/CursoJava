package com.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = ler.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto + "\n");
		
		
		System.out.println("Digite sua idade: ");
		int idade = ler.nextInt();
		System.out.println("Sua idade é: " + idade + "\n");
		
		
		System.out.println("Digite sua altura: ");
		double altura = ler.nextDouble();
		System.out.println("Sua altura é: " + altura + "\n");
		
		
		System.out.println("Digite sua afirmação: ");
		boolean afirmacao = ler.nextBoolean();
		System.out.println("Sua afirmação é: " + afirmacao + "\n");*/
		
		System.out.println("Digite sua rua, numero, cidade e preço do imóvel: ");
		String rua = ler.next();
		int numero = ler.nextInt();
		String cidade = ler.next();
		float preco = ler.nextFloat();
		
		System.out.println("Seus dados são: " + "\n");
		System.out.println("Rua: " + rua + "\n");
		System.out.println("Número: " + numero + "\n");
		System.out.println("Cidade: " + cidade + "\n");
		System.out.println("Preço do aluguel: " + preco + "\n");
	}

}
