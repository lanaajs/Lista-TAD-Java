package questao06;

import java.util.Scanner;

public class AgendaTelefonica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Operacoes op = new Operacoes();

		System.out.print("Digite o número de telefone: ");
		op.telefone = sc.nextInt();

		op.adicionar();

		System.out.println("Contatos registrados: ");
		for (String contato : op.contato) {
			System.out.println(contato);
		}

		System.out.println("Deseja editar o número? (sim/não): ");
		sc.nextLine();
		String resposta = sc.nextLine();

		if (resposta.equalsIgnoreCase("sim")) {
			op.editar();
		}

		System.out.println("Contatos registrados após edição: ");
		for (String contato : op.contato) {
			System.out.println(contato);
		}

		System.out.println("Deseja excluir o número? (sim/não): ");
		resposta = sc.nextLine();

		if (resposta.equalsIgnoreCase("sim")) {
			op.excluir();
		}

		System.out.println("Contatos registrados após exclusão: ");
		for (String contato : op.contato) {
			System.out.println(contato);
		}
		
		sc.close();
	}

}
