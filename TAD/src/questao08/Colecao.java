package questao08;

import java.util.Scanner;

public class Colecao {

    public static void main(String[] args) {
        
        Carrinhos carrinhos = new Carrinhos();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Carrinho");
            System.out.println("2. Listar Carrinhos por Modelo");
            System.out.println("3. Listar Carrinhos por Raridade");
            System.out.println("4. Listar Carrinhos por Edição");
            System.out.println("5. Listar Carrinhos por Valor");
            System.out.println("6. Sair");
            
            System.out.print("\nEscolha uma opção: ");
            int opcao = sc.nextInt();
            
            sc.nextLine(); 
            
            switch (opcao) {
                case 1:
                    carrinhos.adicionar();
                    break;
                    
                case 2:
                    carrinhos.modelos();
                    break;
                    
                case 3:
                    carrinhos.raridade();
                    break;
                    
                case 4:
                    carrinhos.edicoes();
                    break;
                    
                case 5:
                    carrinhos.valor();
                    break;
                    
                case 6:
                    System.out.println("Saindo...");
                    sc.close(); 
                    return;
                    
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
