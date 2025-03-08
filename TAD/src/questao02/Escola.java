package questao02;

public class Escola {

	public static void main(String[] args) {
		
		Estudante aluno = new Estudante("Alana", 3);

        System.out.println("Nome do Aluno: " + aluno.nome());
        System.out.println("Semestre: " + aluno.semestre());

	}

}
