package exercicio_lista;

import java.util.Scanner;
import entities.Funcionario;
import java.util.List;
import java.util.ArrayList; 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Informe a quantidade de colaboradores que serão cadastrados:");
		int qnt = sc.nextInt(); 
		
		List<Funcionario> lista = new ArrayList<>();
		
		for(int i=0; i<qnt; i++) {
			System.out.println("Colaborador #" + (i+1) + ":");
			int id = sc.nextInt(); 
			String nome = sc.next(); 
			double salario = sc.nextDouble(); 
			
			lista.add(new Funcionario(id, nome, salario)); 
		}
		
		System.out.println("Informe o código do colaborador que deseja aumentaro o salário: ");
		int buscarid = sc.nextInt(); 
		
		System.out.println("Informe a quantia que subirá no salário do colaborador: ");
		double valor = sc.nextDouble(); 
		
		for(Funcionario obj : lista) {
			if(obj.getId() == buscarid) {
				obj.AumentoSalario(valor);
			}
		}
		
		System.out.println("-----------------------");
		System.out.println("Lista de funcionários");
		
		for(Funcionario obj : lista) {
			System.out.println(obj.toString());
		}
	}

}
