package questao06;

import java.util.ArrayList;
import java.util.Scanner;

public class Operacoes implements IOperacoes {

	int telefone;
	ArrayList<String> contato;

	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public ArrayList<String> getContato() {
		return contato;
	}
	public void setContato(ArrayList<String> contato) {
		this.contato = contato;
	}

	public Operacoes() {
		this.contato = new ArrayList<>();
	}

	@Override
	public void adicionar() {
		contato.add("Número adicionado: " + telefone);
		System.out.println("Número adicionado: " + telefone);
	}

	@Override
	public void excluir() {
		if (contato.contains("Número adicionado: " + telefone)) {
			contato.remove("Número adicionado: " + telefone);
			System.out.println("Número " + telefone + " excluído");
		} else {
			System.out.println("Número não encontrado!!");
		}
	}

	@Override
	public void editar() {
		if (contato.contains("Número adicionado: " + telefone)) {
			contato.remove("Número adicionado: " + telefone);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite o novo número: ");
			telefone = sc.nextInt();
			contato.add("Número editado para: " + telefone);
			
			System.out.println("Número editado com sucesso.");
			sc.close();
			
		} else {
			System.out.println("Número não encontrado para edição.");
		}
		
	}
}
