package questao16;

import java.time.LocalDate;

public class Anotacao {

    private LocalDate data;
    private String titulo;
    private String conteudo;

    public Anotacao(LocalDate data, String titulo, String conteudo) {
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "\nData: " + data + "\nTítulo: " + titulo + "\nConteúdo: " + conteudo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}

