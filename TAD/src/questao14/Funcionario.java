package questao14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario implements IFuncionario{
	
	String nome;
	String cargo;
	double salario;
	LocalDate dataAdmissao;
	
	private Scanner sc = new Scanner(System.in);
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public String getNome() {
		return nome;
	}
	public String getCargo() {
		return cargo;
	}
	public double getSalario() {
		return salario;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public String nome() {
		System.out.print("Digite o nome do novo colaborador: ");
		nome = sc.nextLine();
		return nome;
	}

	@Override
	public String cargo() {
		System.out.print("Digite o cargo: ");
		cargo = sc.nextLine();
		return cargo;
	}

	@Override
	public double salario() {
		System.out.print("Digite o salário: ");
		salario = sc.nextDouble();
		sc.nextLine(); //limpar o buffer
		return salario;
	}

	@Override
	public String dataAdmissao() {
		System.out.print("Digite a data de admissão (dd/MM/yyyy): ");
        String dataString = sc.nextLine();
        
        try {
            dataAdmissao = LocalDate.parse(dataString, formatter);
            return dataAdmissao.format(formatter);
        } catch (Exception e) {
            System.out.print("Data inválida. Use o formato dd/MM/yyyy.");
        }
        
        return dataAdmissao.format(formatter);
	}
	
}
