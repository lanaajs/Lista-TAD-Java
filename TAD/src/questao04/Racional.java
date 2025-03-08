package questao04;

public class Racional implements IRacional {

    int numerador;
    int denominador;

    // Adicionar um novo número racional para o método de soma
    Racional outro;

    // Gets e sets
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Racional getOutro() {
        return outro;
    }

    public void setOutro(Racional outro) {
        this.outro = outro;
    }

    // Criando o número racional dentro das limitações
    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("O denominador NÃO pode ser zero!!");
        }
        
        this.denominador = denominador;
        this.numerador = numerador;
    }

    // Mostrar o racional como string
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Métodos da interface
    @Override
    public void criar() {
        Racional numero = new Racional(numerador, denominador);
        System.out.println("Número racional 1 criado: " + numero);
    }

    @Override
    public void somar() {
        if (outro == null) {
            System.out.println("Nenhum segundo número racional foi definido!!");
            return;
        }

        int novoNumerador = this.numerador * outro.denominador + outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;

        Racional resultado = new Racional(novoNumerador, novoDenominador);
        System.out.println("Soma de " + this + " + " + outro + " = " + resultado);
    }

    @Override
    public void multiplicar() {
    	if (outro == null) {
            System.out.println("Nenhum segundo número racional foi definido!!");
            return;
        }

        int novoNumerador = this.numerador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;

        Racional resultado = new Racional(novoNumerador, novoDenominador);
        System.out.println("Multiplicação de " + this + " x " + outro + " = " + resultado);
    }

    @Override
    public void teste() {
    	if (outro == null) {
            System.out.println("Nenhum segundo número racional foi definido!!");
            return;
        }

    	if (this.numerador == outro.numerador && outro.denominador == this.denominador) {
            System.out.println(this + " é igual a " + outro);
        } else {
            System.out.println(this + " não é igual a " + outro);
        }
    }
}