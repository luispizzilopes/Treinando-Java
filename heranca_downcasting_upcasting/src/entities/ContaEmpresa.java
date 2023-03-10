package entities;

public class ContaEmpresa extends Conta {
	private double limiteEmprestimo; 
	
	public ContaEmpresa() {super();}
	
	public ContaEmpresa(int numero, String titular, double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void Emprestimo(int valor) {
		if(valor <= limiteEmprestimo) {
			saldo += valor - 10; 
		}
	}
}
