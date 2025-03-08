package questao11;

import java.util.Scanner;

public class Estoque implements IOperacoes {

    private String nome;
    private int codigo;
    private int qtd;
    private double precoUnitario;

    private Scanner sc = new Scanner(System.in);

    @Override
    public String nome() {
        System.out.print("Digite o nome do produto: ");
        return this.nome = sc.nextLine();
    }

    @Override
    public int codigo() {
        System.out.print("Digite o código do produto (" + nome + "): ");
        return this.codigo = sc.nextInt();
    }

    @Override
    public int qtd() {
        System.out.print("Digite a quantidade do produto (" + nome + "): ");
        return this.qtd = sc.nextInt();
    }

    @Override
    public double precoUnitario() {
        System.out.print("Digite o preço unitário do produto (" + nome + "): ");
        return this.precoUnitario = sc.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
