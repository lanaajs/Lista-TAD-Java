package questao10;

import java.util.HashMap;
import java.util.Map;

public class Musica {

    private String nome;
    private String artista;
    private double duracao;

    public Musica(String nome, String artista, double duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public static Map<String, Musica> getMusicasDisponiveis() {
		return MUSICAS_DISPONIVEIS;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	@Override
    public String toString() {
        return nome + " - " + artista + " (" + duracao + " min)";
    }

    public static final Map<String, Musica> MUSICAS_DISPONIVEIS = new HashMap<>();

    static {
        MUSICAS_DISPONIVEIS.put("Me ama", new Musica("Me ama", "Jose Jr", 5.32));
        MUSICAS_DISPONIVEIS.put("Shape of You", new Musica("Shape of You", "Ed Sheeran", 3.53));
        MUSICAS_DISPONIVEIS.put("Love Yourself", new Musica("Love Yourself", "Justin Bieber", 2.56));
        MUSICAS_DISPONIVEIS.put("Evidências", new Musica("Evidências", "Chitãozinho & Xororó", 4.05));
        MUSICAS_DISPONIVEIS.put("Construção", new Musica("Construção", "Chico Buarque", 3.44));
    }
}
