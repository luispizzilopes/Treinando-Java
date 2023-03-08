package encapsulamento;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto(); 
		
		produto1.setNome("TV");
		produto1.setPreco(1999.90);
		produto1.setQnt(10);
		
		Produto produto2 = new Produto("Celular", 999.99, 15); 
		
		System.out.println(produto1.toString());
		System.out.println(produto2.toString());
	}

}
