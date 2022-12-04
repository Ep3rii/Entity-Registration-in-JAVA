package entities;

public class Professor extends Pessoa {
	
private double salario;
	
	public Professor() {	
	}
	
	public Professor(String nome, String rg, String cpf, String dia, String mes, String ano, double salario) {
		super(nome, rg, cpf, dia, mes, ano);
		this.salario = salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

}

