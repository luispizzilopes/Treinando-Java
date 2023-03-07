package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in); 
		
		int minutos = sc.nextInt(); 
		double valor = 50; 
		
		System.out.println("Informe a quantidade de minutos utlizados: ");
		
		valor = (minutos > 100) ? valor + (minutos - 100) * 2 : 50; 
		
		System.out.printf("O valor da conta ficou em: %.2f", valor);
	}
}