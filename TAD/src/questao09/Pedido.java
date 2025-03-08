package questao09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pedido extends Cliente implements ICadastro {
	Scanner sc = new Scanner(System.in);
	
    private ArrayList<String> itensPedido;
    private static final String[] MENU = {"Pizza", "Hambúrguer", "Sushi", "Salada", "Lasanha", "Churrasco"};
    private static final Map<String, Double> PRECO_MENU = new HashMap<>();

    static {
        PRECO_MENU.put("Pizza", 35.0);
        PRECO_MENU.put("Hambúrguer", 20.0);
        PRECO_MENU.put("Sushi", 45.0);
        PRECO_MENU.put("Salada", 15.0);
        PRECO_MENU.put("Lasanha", 30.0);
        PRECO_MENU.put("Churrasco", 60.0);
    }

    public Pedido() {
        super();
        this.itensPedido = new ArrayList<>();
    }

    public ArrayList<String> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<String> itensPedido) {
        this.itensPedido = itensPedido;
    }

    @Override
    public void dadosCliente() {
        System.out.print("Digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Digite seu endereço: ");
        enderecoCliente = sc.nextLine();
    }

    @Override
    public void itens() {
        System.out.print("\nEscolha os itens do menu para adicionar ao pedido: ");

        for (int i = 0; i < MENU.length; i++) {
            System.out.println("\n" + (i + 1) + " - " + MENU[i] + " (R$ " + PRECO_MENU.get(MENU[i]) + ")");
        }

        System.out.print("\n\nDigite o número do item ou finalize o pedido (0): ");

        while (true) {
            int escolha = sc.nextInt();

            if (escolha == 0) {
                break;
            } else if (escolha > 0 && escolha <= MENU.length) {
                String itemEscolhido = MENU[escolha - 1];
                itensPedido.add(itemEscolhido);
                
                System.out.println(itemEscolhido + " adicionado ao pedido");
                System.out.print("\nEscolha outro item ou finalize (0): ");
            } else {
                System.out.println("Opção inválida!!");
            }
        }
    }

    @Override
    public void qtdItens() {
        System.out.println("\n\nQuantidade de itens no pedido: " + itensPedido.size());
    }

    @Override
    public void valorCompra() {
        double total = 0.0;
        
        System.out.println("\n\nResumo do Pedido: ");
        System.out.println("Pedido de " + nomeCliente);
        System.out.println("Endereço: " + enderecoCliente);
        System.out.println("Itens: ");
        
        for (String item : itensPedido) {
            double preco = PRECO_MENU.get(item);
            total += preco;
            System.out.println(item + " - R$ " + preco);
        }

        System.out.println("\nTotal da compra: R$ " + total);
    }
}
