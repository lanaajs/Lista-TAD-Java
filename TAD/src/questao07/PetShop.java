package questao07;

public class PetShop {

	public static void main(String[] args) {
		
		DadosPet pet = new DadosPet("Marcela Divino", 88454687, "Bolinha", "Golden Retrive", "16/01/2025");
		
		pet.nome();
		pet.telefone();
		pet.dataNascimento();
		pet.raca();
		
	}

}
