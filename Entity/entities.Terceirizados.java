package entities;

public class Terceirizados extends Pessoa {
	
private double salario;
	
	public Terceirizados() {
	}
	
	public Terceirizados(String nome, String rg, String cpf, String dia, String mes, String ano, double salario) {
		super(nome, rg, cpf, dia, mes, ano);
		this.salario = salario;
	}


	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}

