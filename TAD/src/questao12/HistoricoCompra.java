package questao12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HistoricoCompra implements IHistoricoCompra {

    private List<Compra> compras;
    private Scanner sc;

    public HistoricoCompra() {
        this.compras = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    @Override
    public void adicionarCompra() {
        System.out.print("\nDigite o número de itens da compra: ");
        int numItens = sc.nextInt();
        sc.nextLine(); 
        
        List<String> itens = new ArrayList<>();

        for (int i = 0; i < numItens; i++) {
            System.out.print("Digite o nome do item " + (i + 1) + ": ");
            itens.add(sc.nextLine());
        }

        System.out.print("Digite o valor total da compra: ");
        double valorTotal = sc.nextDouble();
        sc.nextLine();  

        Date dataCompra = new Date();

        Compra novaCompra = new Compra(dataCompra, itens, valorTotal);
        compras.add(novaCompra);

        System.out.println("\nCompra adicionada com sucesso!");
    }

    @Override
    public void exibirHistorico() {
        if (compras.isEmpty()) {
            System.out.println("\nNenhuma compra realizada.");
        } else {
            System.out.println("\nHistórico de Compras:");
            for (Compra compra : compras) {
                System.out.println(compra);
            }
        }
    }

    @Override
    public double totalGasto() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.getValorTotal();
        }
        return total;
    }
}
