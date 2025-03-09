package questao16;

import java.util.Scanner;

public class DiarioAnot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Diario diario = new Diario();

		while (true) {
			System.out.println("\n\tMEU DIÁRIO DE ANOTAÇÕES ");
			System.out.println("\nOperações: ");
			System.out.println(" 1 - Adicionar Anotação");
			System.out.println(" 2 - Listar Anotações");
			System.out.println(" 3 - Visualizar Anotação");
			System.out.println(" 4 - Sair");

			System.out.print("\nEscolha uma opção: ");

			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				diario.adicionarAnotacao();
				break;

			case 2:
				diario.listarAnotacoes();
				break;

			case 3:

				diario.visualizarAnotacao();
				break;

			case 4:
				System.out.println("Saindo...");
				sc.close();
				return;

			default:
				System.out.println("Tente novamente!");
			}
		}
	}
}
