package questao05;

import java.util.ArrayList;

public class OperacoesBancarias implements IOperacoes {
	
    double dinheiro;
    ArrayList<String> historicoTransacoes;

    public OperacoesBancarias() {
        this.dinheiro = 0.0;
        this.historicoTransacoes = new ArrayList<>();
    }

    //gets e sets
    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    //metodos da interface
    @Override
    public void visualizarSaldo() {
        System.out.println("Saldo atual: R$ " + dinheiro);
    }

    @Override
    public void depositar() {
        double valor = 300.0; 
        
        dinheiro += valor;
        historicoTransacoes.add("Depósito: R$ " + valor);
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    @Override
    public void sacar() {
        double valor = 200.0; 
        
        if (valor > 0 && valor <= dinheiro) {
            dinheiro -= valor;
            historicoTransacoes.add("Saque: R$ " + valor); 
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    @Override
    public void atualizar() {
        double taxa = 0.04; //add taxa de 4%
        dinheiro += dinheiro * taxa;
        historicoTransacoes.add("Atualização: Taxa de 4% aplicada.");
        System.out.println("Saldo atualizado com sucesso.");
    }


}
