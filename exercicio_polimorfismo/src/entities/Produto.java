package entities;

public class Produto {
	private String nome; 
	protected double preco;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco)
	{
		this.nome = nome;
		this.preco = preco; 
	}
	
	public String tagProduto() {
		return "Nome: " + nome + "\nPreço: " + preco; 
	}
	
	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
}
