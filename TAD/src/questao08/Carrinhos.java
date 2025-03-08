package questao08;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinhos implements IPessoa {

    private ArrayList<Carrinho> carros;

    public Carrinhos() {
        this.carros = new ArrayList<>();
    }

    public ArrayList<Carrinho> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carrinho> carros) {
        this.carros = carros;
    }

    class Carrinho {
        String modelo;
        String raridade;
        String edicao;
        double valor;

        public Carrinho(String modelo, String raridade, String edicao, double valor) {
            this.modelo = modelo;
            this.raridade = raridade;
            this.edicao = edicao;
            this.valor = valor;
        }
    }

    @Override
    public void adicionar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o modelo do carrinho: ");
        String modelo = sc.nextLine();

        System.out.print("Digite a raridade do carrinho: ");
        String raridade = sc.nextLine();

        System.out.print("Digite a edição do carrinho: ");
        String edicao = sc.nextLine();

        System.out.print("Digite o valor do carrinho: ");
        double valor = sc.nextDouble();

        sc.nextLine(); 

        Carrinho novoCarrinho = new Carrinho(modelo, raridade, edicao, valor);
        carros.add(novoCarrinho);

        System.out.println("Carrinho adicionado com sucesso!");
    }

    public void modelos() {
        System.out.println("\nCarrinhos por Modelo:");
        for (Carrinho c : carros) {
            System.out.println("Modelo: " + c.modelo);
        }
    }

    public void raridade() {
        System.out.println("\nCarrinhos por Raridade:");
        for (Carrinho c : carros) {
            System.out.println("Raridade: " + c.raridade);
        }
    }

    public void edicoes() {
        System.out.println("\nCarrinhos por Edição:");
        for (Carrinho c : carros) {
            System.out.println("Edição: " + c.edicao);
        }
    }

    public void valor() {
        System.out.println("\nCarrinhos por Valor:");
        for (Carrinho c : carros) {
            System.out.println("Valor: R$ " + c.valor);
        }
    }
}
