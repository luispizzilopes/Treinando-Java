package exercicio_membros_estaticos;

public class ConversaoDePreco {
	
	public static double precoDolar; 
	public static double iof = 0.06; 
	
	public static double ConversaoReal(double preco) {
		return (preco * precoDolar) + (preco * precoDolar) * iof; 
	}
}
