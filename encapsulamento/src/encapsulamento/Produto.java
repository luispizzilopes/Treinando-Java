package encapsulamento;

public class Produto {
	private String nome; 
	private double preco; 
	private int quantidade; 
	
	public Produto() {}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome; 
		this.preco = preco; 
		this.quantidade = quantidade; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getNome() {
		return this.nome; 
	}
	
	public void setPreco(double preco) {
		this.preco = preco; 
	}
	
	public double getPreco() {
		return preco; 
	}
	
	public void setQnt(int quantidade) {
		this.quantidade = quantidade; 
	}
	
	public int getQnt() {
		return quantidade; 
	}
	
	public String toString() {
		return "Nome do produto: " + nome
				+ " Preço do produto: " + preco 
				+ " Quantidade em estoque: " + quantidade; 
	}
}
