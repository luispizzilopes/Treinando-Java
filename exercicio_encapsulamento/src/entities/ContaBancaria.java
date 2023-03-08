package entities;

public class ContaBancaria {
	
	private int numeroConta; 
	private String nomeTitular; 
	private double saldo; 
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
		 this.numeroConta = numeroConta; 
		 this.nomeTitular = nomeTitular; 
		 this.saldo = saldo; 
	}
	
	public void Deposito(double valor) {
		saldo += valor; 
	}
	
	public void Saque(double valor) {
		saldo -= valor - 5; 
	}
	
	public String toString() {
		return "Conta: " + numeroConta +
				" Títular da  conta: " + nomeTitular +
				" Saldo: " + saldo; 
	}
}
