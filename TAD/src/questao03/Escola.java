package questao03;

public class Escola {

	public static void main(String[] args) {
		
		Professor im = new Professor("Rafaela", 5268);
		
		System.out.println("Nome do Professor: " + im.nomeProfessor());
        System.out.println("Código da Disciplina: " + im.codDisciplina());

	}

}
