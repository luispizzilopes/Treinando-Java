package saida_de_dados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String produto = "Computer"; 
		String produto2 = "Office Desk"; 
		
		int age = 30; 
		int code = 5290; 
		char gender = 'F'; 
		
		double preco1 = 2100.0; 
		double preco2 = 650.50; 
		double measure = 53.234567; 
		
		System.out.println("Products:");
		System.out.println(produto + ", Wich price is $ " + preco1); 
		System.out.println(produto2 + "which price is $ " + preco2);
		
		System.out.println("\nRecord: " + age + "years old, code " + code + " and gender: " + gender);
		
		System.out.printf("\nMeasue with eight decimal places %.8f\n", measure);
		System.out.printf("Rouded: %.3f\n", measure);
		Locale.setDefault(Locale.US); 
		System.out.printf("US Decimal point: %.3f\n", measure); 
	}
}
