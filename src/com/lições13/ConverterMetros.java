package com.li��es13;

import java.util.Scanner;

public class ConverterMetros {

	public static void main(String[] args) {
		
		Scanner conversor = new Scanner(System.in);
		
		System.out.println("digite metros: ");
		
		float metros = conversor.nextFloat();
		float cm = metros * 100;
		
		System.out.println(metros + "m � igual a " + cm + "cm");
		
	}

}
