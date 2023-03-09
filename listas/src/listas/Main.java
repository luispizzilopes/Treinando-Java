package listas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<String> listanomes = new ArrayList<>(); 
		
		listanomes.add("Luis");
		listanomes.add("Teste"); 
		listanomes.add("Mario"); 
		listanomes.add("String"); 
		listanomes.add("Marcelo"); 
		
		System.out.println(listanomes.size());
		
		for(String nome : listanomes) {
			System.out.println(nome);
		}
		
		listanomes.removeIf(x -> x.charAt(0) == 'L'); 
		
		System.out.println("--------------");
		
		for(String nome : listanomes) {
			System.out.println(nome);
		}
		
		System.out.println("--------------");
		
		System.out.println("Index of String:" + listanomes.indexOf("String"));
		
		System.out.println("--------------");
		
		List<String> resultado = listanomes.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList()); 
		
		for(String nome : resultado) {
			System.out.println(nome);
		}
		
		System.out.println("--------------");
		String nome = listanomes.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null); 
		System.out.println(nome);
		
	}

}
