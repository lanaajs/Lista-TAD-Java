package questao14;

public class Empresa {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		System.out.println("\tEMPRESA DE LANA");
		System.out.println("\nCADASTRO DE COLABORADOR:");
		
		f.nome();
		f.cargo();
		f.salario();
		f.dataAdmissao();
		
		System.out.println("\n" + f.getNome() + " cadastrado com sucesso!");
	}

}
