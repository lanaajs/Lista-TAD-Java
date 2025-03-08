package questao07;

public class DadosPet extends DadosDono implements ISistema {

    String nomePet;
    String racaPet;
    String dataNascimentoPet;
 
    public DadosPet(String nomeDono, int telefoneDono, String nomePet, String racaPet, String dataNascimentoPet) {
        super(nomeDono, telefoneDono); 
        this.nomePet = nomePet;
        this.racaPet = racaPet;
        this.dataNascimentoPet = dataNascimentoPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRacaPet() {
        return racaPet;
    }

    public void setRacaPet(String racaPet) {
        this.racaPet = racaPet;
    }

    public String getDataNascimentoPet() {
        return dataNascimentoPet;
    }

    public void setDataNascimentoPet(String dataNascimentoPet) {
        this.dataNascimentoPet = dataNascimentoPet;
    }


    @Override
    public String nome() {
    	System.out.println("Nome do Pet: " + nomePet);
        return nomePet;
    }

    @Override
    public int telefone() {
        System.out.println("Contato: " + telefoneDono);
		return telefoneDono;
    }

    @Override
    public void dataNascimento() {
        System.out.println("Data de nascimento do pet: " + dataNascimentoPet);
    }

    @Override
    public void raca() {
        System.out.println("Raça do pet: " + racaPet);
    }
}
