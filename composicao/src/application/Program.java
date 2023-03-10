package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoPorHoras;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.LevelDeTrabalho;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.print("Entre com o departamento: ");
		String departamento = sc.nextLine(); 
		System.out.print("Entre com as informações do trabalhador: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine(); 
		System.out.print("Level: ");
		String level = sc.nextLine(); 
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble(); 
		
		Trabalhador trabalhador = new Trabalhador(nome, LevelDeTrabalho.valueOf(level), salarioBase, new Departamento(departamento));
		
		System.out.println("Quantos contratos serão informados? ");
		int qnt = sc.nextInt(); 
		
		for(int i=0; i<qnt; i++) {
			System.out.println("Entre com o " + (i + 1) + "º contrato: ");
			System.out.print("Data (DD/MM/AAAA): ");
			Date contratoData = sdf.parse(sc.next()); 
			System.out.print("Valor por hora: ");
			double valor = sc.nextDouble(); 
			System.out.print("Duração: ");
			int horas = sc.nextInt(); 
			ContratoPorHoras contrato = new ContratoPorHoras(contratoData, valor, horas);
			trabalhador.AdicionarContrato(contrato); 
		}
		
		System.out.println();
		System.out.print("Entre com o mês e o ano do contrato (MM/AAAA): ");
		String anoMes = sc.next(); 
		int mes = Integer.parseInt(anoMes.substring(0,2)); 
		int ano = Integer.parseInt(anoMes.substring(3)); 
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Total: " + String.format("%.2f", trabalhador.Total(ano, mes)));
		
		sc.close();
	}

}
