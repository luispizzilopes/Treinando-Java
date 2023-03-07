package entrada_de_dados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		//Ler uma variável do tipo string com o scanner
		String nome; 
		nome = sc.next();
		System.out.println("O nome informado foi: " + nome);
		
		//Ler uma variável do tipo int 
		int numero; 
		numero = sc.nextInt(); 
		System.out.println("O número informado foi: " + numero);
		
		//Ler uma variável do tipo double
		double numero2; 
		numero2 = sc.nextDouble();
		System.out.println("O número inforado foi: " + numero2);
		
		//Ler um char
		char letra; 
		letra = sc.next().charAt(0); 
		System.out.println("A Letra informada foi: " + letra);
		
		//Ler uma variável do tipo string com quebra de linha
		nome = sc.nextLine(); 
		System.out.println("O nome informado foi: " + nome);
		
		sc.close();
	}

}
