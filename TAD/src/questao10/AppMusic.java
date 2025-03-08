package questao10;

public class AppMusic {

	public static void main(String[] args) {
		Playlist play = new Playlist();
		
		System.out.println("APP MUSIC");
		System.out.println("Músicas Disponíveis no DB:\r\n"
				+ "Me ama - Jose Jr (5.32 min)\r\n"
				+ "Shape of You - Ed Sheeran (3.53 min)\r\n"
				+ "Love Yourself - Justin Bieber (2.56 min)\r\n"
				+ "Evidências - Chitãozinho & Xororó (4.05 min)\r\n"
				+ "Construção - Chico Buarque (3.44 min)\r\n"
				+ "");
		
		play.adicionarMusica("Me ama");
		play.adicionarMusica("Shape of You");
		play.adicionarMusica("Construção");
		
		play.removerMusica("Construção");
		
		play.listarMusicas();
	}

}
