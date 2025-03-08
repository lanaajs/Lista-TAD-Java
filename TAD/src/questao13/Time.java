package questao13;

public class Time {

    private String nome;
    private int gols;

    public Time(String nome) {
        this.nome = nome;
        this.gols = 0;
    }

    public void adicionarGols(int gols) {
        this.gols += gols;
    }

    public String getNome() {
        return nome;
    }

    public int getGols() {
        return gols;
    }

    @Override
    public String toString() {
        return nome + " | Gols: " + gols;
    }
}
