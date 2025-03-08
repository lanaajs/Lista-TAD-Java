package questao02;

public class Estudante implements IEstudante {

	//variavel
    String nomeAluno;
    int semestreDisciplina;

    //construtor
    public Estudante(String nomeAluno, int semestreDisciplina) {
        this.nomeAluno = nomeAluno;
        this.semestreDisciplina = semestreDisciplina;
    }
    
    // gets e sets
    public String getNomeAluno() {
		return nomeAluno;
	}
    
    public int getSemestreDisciplina() {
		return semestreDisciplina;
	}
    
    public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
    
    public void setSemestreDisciplina(int semestreDisciplina) {
		this.semestreDisciplina = semestreDisciplina;
	}

    // metodos da interface
    @Override
    public String nome() {
        return nomeAluno;
    }

    @Override
    public int semestre() {
        return semestreDisciplina;
    }
}
