package entities;

public class Pessoa {    // classe pai HERANÇA
	
	private String nome, rg, cpf, dia, mes, ano;      //ABSTRAÇÃO definindo atributos com ENCAPSULAMENTO
	
	public Pessoa() {	      // CONSTRUTOR padrão
	}

	public Pessoa(String nome, String rg, String cpf, String dia, String mes, String ano) {   // COSTRUTOR com argumentos
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {   // GETTERS E SETTERS  definindo métodos ABSTRAÇÃO
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	
}
