package exercicio_membros_estaticos;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe o preço do dólar: ");
		ConversaoDePreco.precoDolar = sc.nextDouble(); 
		System.out.println("Informe o preço do produto em dólar: ");
		double valorDolar = sc.nextDouble(); 
		double valorReal = ConversaoDePreco.ConversaoReal(valorDolar); 
		
		System.out.println("Você terá que pagar R$" + valorReal);
		
		sc.close();
	}

}
