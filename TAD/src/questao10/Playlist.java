package questao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Playlist implements IOperacoes {

    private List<Musica> musicas;

    public Playlist() {
        this.musicas = new ArrayList<>();
    }

    @Override
    public void adicionarMusica(String tituloMusica) {
        Musica musica = Musica.MUSICAS_DISPONIVEIS.get(tituloMusica);
        
        if (musica != null) {
            musicas.add(musica);
            System.out.println("Música adicionada: " + musica.getNome());
        } else {
            System.out.println("Música não encontrada: " + tituloMusica);
        }
    }

    @Override
    public void removerMusica(String nomeMusica) {
        boolean removido = musicas.removeIf(m -> m.getNome().equalsIgnoreCase(nomeMusica));
        
        if (removido) {
            System.out.println("\nMúsica removida: " + nomeMusica);
        } else {
            System.out.println("\nNenhuma música removida");
        }
    }

    @Override
    public void listarMusicas() {
        if (musicas.isEmpty()) {
            System.out.println("\nA playlist está vazia.");
        } else {
            System.out.println("\nPlaylist: ");
            for (Musica musica : musicas) {
                System.out.println(musica);
            }
        }
    }
}
