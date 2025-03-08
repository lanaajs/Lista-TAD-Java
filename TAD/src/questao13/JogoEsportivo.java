package questao13;

public class JogoEsportivo {

	public static void main(String[] args) {
		ICampeonato campeonato = new Campeonato("Brasileiro");

        campeonato.adicionarTime();
        campeonato.adicionarTime();

        campeonato.registrarResultado();

        campeonato.exibirClassificacao();

	}

}
