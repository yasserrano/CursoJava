package com.lições17;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean info =  false;
		String nomeUser;
		String senha;
		
		do {
			
			System.out.println("Entre com o nome do usuário");
			nomeUser = scan.next();
			
			System.out.println("Entre com a senha:");
			senha = scan.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				info = false;
				System.out.println("Senha igual a usuario, digite novamente.");
				
			} else {
				info = true;
				System.out.println("Senha e usuarios validos.");
				
			}
			
		} while (!info);
	
	}		
	
}
