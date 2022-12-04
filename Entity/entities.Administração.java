package entities;

public class Administração extends Pessoa {
	
	private double salario;
	
	public Administração() {
	}
	
	public Administração(String nome, String rg, String cpf, String dia, String mes, String ano, double salario) {
		super(nome, rg, cpf, dia, mes, ano);       // CONTRUTOR puxando a SUPER CLASSE (Pessoa) HERANÇA
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

