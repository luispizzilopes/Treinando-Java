package entities;

public class ProdutoImportado extends Produto{
	
	private double custoImportacao; 
	
	public ProdutoImportado() {
		
	}
	
	public ProdutoImportado(String nome, double valor, double custoImportacao) {
		super(nome, valor); 
		this.custoImportacao = custoImportacao; 
	}
	
	public double PrecoTotal() {
		return preco += custoImportacao; 
	}
	
	@Override
	public String tagProduto() {
		return "Nome: " + getNome() + "\nPreço: " + preco +
				"\nPreço importação: " + custoImportacao +
				"\nPreço Total: " + PrecoTotal(); 
	}
}
