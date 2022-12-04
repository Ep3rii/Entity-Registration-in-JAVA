package lista_p2;

import java.util.Scanner;

import entities.Administração;
import entities.Aluno;
import entities.Professor;
import entities.Terceirizados;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// entrada das informações necessárias
		
		System.out.println("Informe os dados de ALUNO:");
		System.out.println("");
		
		Aluno a;
		a = new Aluno();
		
		System.out.println("Nome: ");
		a.setNome(sc.next());
		System.out.println("CPF: ");
		a.setCpf(sc.next());
		System.out.println("RG: ");
		a.setRg(sc.next());
		System.out.println("Dia de nascimento: ");
		a.setDia(sc.next());
		System.out.println("Mês de nascimento: ");
		a.setMes(sc.next());
		System.out.println("Ano de nascimento:");
		a.setAno(sc.next());
		System.out.println("Número de matricula: ");
		a.setMatricula(sc.next());
		
		
		
		
		
		Professor b;
		b = new Professor();
		
		System.out.println("Informe os dados do professor");
		System.out.println("");
		System.out.println("Nome: ");
		b.setNome(sc.next());
		System.out.println("CPF: ");
		b.setCpf(sc.next());
		System.out.println("RG: ");
		b.setRg(sc.next());
		System.out.println("Dia de nascimento: ");
		b.setDia(sc.next());
		System.out.println("Mês de nascimento: ");
		b.setMes(sc.next());
		System.out.println("Ano de nascimento:");
		b.setAno(sc.next());
		System.out.println("Salario (R$): ");
		b.setSalario(sc.nextDouble());
		
		
		
		
		
		Administração c;
		c = new Administração();
		
		System.out.println("Informe os dados do funcionario da administração");
		System.out.println("");
		System.out.println("Nome: ");
		c.setNome(sc.next());
		System.out.println("CPF: ");
		c.setCpf(sc.next());
		System.out.println("RG: ");
		c.setRg(sc.next());
		System.out.println("Dia de nascimento: ");
		c.setDia(sc.next());
		System.out.println("Mês de nascimento: ");
		c.setMes(sc.next());
		System.out.println("Ano de nascimento:");
		c.setAno(sc.next());
		System.out.println("Salario (R$): ");
		c.setSalario(sc.nextDouble());
		
		
		
		Terceirizados d;
		d = new Terceirizados();
		
		System.out.println("Informe os dados do funcionario terceirizado");
		System.out.println("");
		System.out.println("Nome: ");
		d.setNome(sc.next());
		System.out.println("CPF: ");
		d.setCpf(sc.next());
		System.out.println("RG: ");
		d.setRg(sc.next());
		System.out.println("Dia de nascimento: ");
		d.setDia(sc.next());
		System.out.println("Mês de nascimento: ");
		d.setMes(sc.next());
		System.out.println("Ano de nascimento:");
		d.setAno(sc.next());
		System.out.println("Salario (R$): ");
		d.setSalario(sc.nextDouble());
		
		
		//saída das informações gravadas
		
		System.out.println("");
		System.out.println("-----INFORMAÇÕES SOBRE O ALUNO-----");
		System.out.println("Nome: " + a.getNome());
		System.out.println("CPF: " + a.getCpf());
		System.out.println("RG: " + a.getRg());
		System.out.println("Data de nascimento: " + a.getDia() + "/" + a.getMes() + "/" + a.getAno());
		System.out.println("Numero da Matricula: " + a.getMatricula());
		
		System.out.println("");
		System.out.println("-----INFORMAÇÕES SOBRE O PROFESSOR-----");
		System.out.println("Nome: " + b.getNome());
		System.out.println("CPF: " + b.getCpf());
		System.out.println("RG: " + b.getRg());
		System.out.println("Data de nascimento: " + b.getDia() + "/" + b.getMes() + "/" + b.getAno());
		System.out.println("Salario (R$): " + b.getSalario());
		
		System.out.println("");
		System.out.println("-----INFORMAÇÕES SOBRE O FUNCIONARIO DA ADMINISTRAÇÃO-----");
		System.out.println("Nome: " + c.getNome());
		System.out.println("CPF: " + c.getCpf());
		System.out.println("RG: " + c.getRg());
		System.out.println("Data de nascimento: " + c.getDia() + "/" + c.getMes() + "/" + c.getAno());
		System.out.println("Salario (R$): " + c.getSalario());
		
		System.out.println("");
		System.out.println("-----INFORMAÇÕES SOBRE O FUNCIONARIO TERCEIRIZADO-----");
		System.out.println("Nome: " + d.getNome());
		System.out.println("CPF: " + d.getCpf());
		System.out.println("RG: " + d.getRg());
		System.out.println("Data de nascimento: " + d.getDia() + "/" + d.getMes() + "/" + d.getAno());
		System.out.println("Salario (R$): " + d.getSalario());
		
		sc.close();

	}

}

