package questao16;

import java.time.LocalDate; 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diario implements IDiario {

    Scanner sc = new Scanner(System.in); 
    
    List<Anotacao> anotacoes = new ArrayList<>();
    
    @Override
    public void adicionarAnotacao() {
        System.out.print("\nDigite o título da anotação: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o conteúdo da anotação: ");
        String conteudo = sc.nextLine();

        LocalDate data = LocalDate.now(); //pega a data atual

        Anotacao anotacao = new Anotacao(data, titulo, conteudo); //cria a anotação pegando os dados
        anotacoes.add(anotacao); //adiciona à lista

        System.out.println("\nAnotação adicionada com sucesso!");
        System.out.println("--------------------------------------------------");
    }

    @Override
    public void listarAnotacoes() {
        if (anotacoes.isEmpty()) {
            System.out.println("\nNenhuma anotação registrada.");
            System.out.println("--------------------------------------------------");
            return;
        }

        //exibe a lista de anotações com numeração
        for (int i = 0; i < anotacoes.size(); i++) {
            System.out.println("\nÍndice " + (i + 1) + "\r" 
            			+ anotacoes.get(i));
            System.out.println("--------------------------------------------------");
        }
    }

    @Override
    public void visualizarAnotacao() {
        System.out.print("\nDigite o índice da anotação que deseja visualizar: ");
        int indice = sc.nextInt();
        sc.nextLine();

        //ajusta o índice para corresponder ao formato 1-based
        if (indice >= 1 && indice <= anotacoes.size()) {
            System.out.println(anotacoes.get(indice - 1)); //exibe a anotação correspondente ao índice
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("\nAnotação não encontrada.");
            System.out.println("--------------------------------------------------");
        }
    }
}
