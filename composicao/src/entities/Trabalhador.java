package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.LevelDeTrabalho;

public class Trabalhador {
	private String nome; 
	private LevelDeTrabalho level; 
	private double SalarioBase; 
	
	private Departamento departamento; 
	private List<ContratoPorHoras> contratos = new ArrayList<>(); 
	
	public Trabalhador() {

	}

	public Trabalhador(String nome, LevelDeTrabalho level, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		SalarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LevelDeTrabalho getLevel() {
		return level;
	}

	public void setLevel(LevelDeTrabalho level) {
		this.level = level;
	}

	public double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHoras> getContratos() {
		return contratos;
	}

	public void AdicionarContrato(ContratoPorHoras contrato) {
		contratos.add(contrato); 
	}
	
	public void RemoverContrato(ContratoPorHoras contrato) {
		contratos.remove(contrato); 
	}
	
	public double Total(int ano, int mes) {
		double soma = SalarioBase;
		Calendar cal = Calendar.getInstance();  
		for(ContratoPorHoras contrato : contratos) {
			cal.setTime(contrato.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH); 
			
			if(ano == c_ano && mes == c_mes) {
				soma += contrato.ValorTotal(); 
			}
		}
		return soma; 
	}
}
