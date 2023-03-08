package exercicio_encapsulamento;

import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		ContaBancaria conta; 
		
		System.out.println("Informe o número da conta: ");
		int numeroConta = sc.nextInt(); 
		
		System.out.println("Informe o nome do títular da conta: ");
		sc.nextLine(); 
		String nome = sc.nextLine(); 
		
		System.out.println("Terá um depósito inicial?");
		char resp = sc.next().charAt(0); 
		
		if(resp == 'y') {
			System.out.println("Informe o valor do depósito inicial: ");
			double valor = sc.nextDouble();
			conta = new ContaBancaria(numeroConta, nome, valor); 
		}
		else {
			conta = new ContaBancaria(numeroConta, nome, 0);
		}
		System.out.println(conta);
		
		System.out.println("Informe um valor de depósito: ");
		double valor = sc.nextDouble(); 
		conta.Deposito(valor);
		System.out.println(conta);
		
		System.out.println("Informe um valor de Saque: ");
		double valorSaque = sc.nextDouble(); 
		conta.Saque(valorSaque);
		System.out.println(conta);
	}

}
