package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoArrumado extends Produto{
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa"); 
	private String dataReparo;
	
	public ProdutoArrumado() {}
	
	public ProdutoArrumado(String nome, double preco, String data) {
		super(nome, preco); 
		dataReparo = data; 
	}
	
	@Override
	public String tagProduto() {
		return "Nome: " + getNome() + "\nPreço: " + preco +
				"\nData de reparo: " + dataReparo; 
	}
}
