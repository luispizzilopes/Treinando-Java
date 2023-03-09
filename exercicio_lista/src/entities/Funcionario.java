package entities;

public class Funcionario {
	
	private int id; 
	private String nome; 
	private double salario; 
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id; 
		this.nome = nome; 
		this.salario = salario; 
	}
	
	public int getId() {
		return id; 
	}
	
	public void AumentoSalario(double valor) {
		salario += valor; 
	}
	
	public String toString() {
		return id + ", " + nome + ", " + salario; 
	}
}
