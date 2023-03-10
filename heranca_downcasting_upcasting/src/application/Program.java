package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Conta conta = new Conta(10, "Luis", 100.0);
		ContaEmpresa contaEmpresa = new ContaEmpresa(1001, "empresa", 10000, 100000); 
		
		//UPCASTING (subclasse para superclasse)
		Conta conta3 = contaEmpresa; 
		Conta conta4 = new ContaEmpresa(1002, "teste", 100, 500); 
		Conta conta5 = new ContaPoupanca(1003, "vini", 1000, 0.05); 
		
		//DOWNCASTING (superclasse para subclasse)
		
		ContaEmpresa conta6 = (ContaEmpresa)conta4; 
		//ContaPoupanca conta7 = (ContaPoupanca)conta4; - erro
		
		if(conta4 instanceof ContaPoupanca) {
			ContaPoupanca contapoupanca = new ContaPoupanca(100, "luis", 1000, 0.09); 
			contapoupanca.AtualizarSaldo();
			System.out.println("Saldo atualizado");
		}
		
		if(conta4 instanceof ContaEmpresa) {
			ContaEmpresa contae = new ContaEmpresa(1000, "empresa", 10000, 100000); 
			contae.Emprestimo(1000);
			System.out.println("Saldo alterado com o valor recebido!");
		}
	}

}
