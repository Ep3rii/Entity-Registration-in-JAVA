package entities;

public class Aluno extends Pessoa {  // HERANÇA puxa os dados de Pessoa (classe pai)
	
	private String matricula;
	
	public Aluno() {
	}

	public Aluno(String nome, String rg, String cpf, String dia, String mes, String ano, String matricula) {
		super(nome, rg, cpf, dia, mes, ano);
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}

