package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoArrumado;
import entities.ProdutoImportado;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de produtos que serão informados: ");
		int n = sc.nextInt(); 
		
		List<Produto> listaProdutos = new ArrayList<>(); 
		
		for(int i=0; i<n; i++) {
			System.out.println("Informe a condição do produto que deseja cadastrar: ");
			char opc = sc.next().charAt(0); 
			
			if(opc == 'i') {
				System.out.println("Informe o nome do produto: ");
				sc.next(); 
				String nome = sc.nextLine(); 
				System.out.println("Informe o preço do produto: ");
				double preco = sc.nextDouble(); 
				System.out.println("Informe o valor de importação do produto: ");
				double valorImportacao = sc.nextDouble(); 
				
				listaProdutos.add(new ProdutoImportado(nome, preco, valorImportacao)); 
			}
			else if(opc == 'a') {
				System.out.println("Informe o nome do produto: "); 
				sc.next(); 
				String nome = sc.nextLine(); 
				System.out.println("Informe o preço do produto: ");
				double preco = sc.nextDouble(); 
				System.out.println("Informe a data de conserto do produto (dd/MM/aaaa): ");
				String data = sc.nextLine(); 
				
				listaProdutos.add(new ProdutoArrumado(nome, preco, data)); 
			
			}
			else {
				System.out.println("Informe o nome do produto: ");
				sc.next(); 
				String nome = sc.nextLine(); 
				System.out.println("Informe o preço do produto: ");
				double preco = sc.nextDouble();
				
				listaProdutos.add(new Produto(nome, preco)); 
			}
		}
		
		for(Produto p : listaProdutos) {
			p.tagProduto(); 
		}
	}
}
