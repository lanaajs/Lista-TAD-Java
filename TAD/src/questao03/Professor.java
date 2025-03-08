package questao03;

public class Professor implements IProfessor {

	public String nome;
	public int cod;

	public Professor(String nome, int cod) {
        this.nome = nome;
        this.cod = cod;
    }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public String nomeProfessor() {
		return nome;
	}

	@Override
	public int codDisciplina() {
		return cod;
	}
}
