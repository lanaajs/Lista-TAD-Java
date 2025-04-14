package Questao01;

import java.util.Scanner;

public class Disciplina implements IDisciplina {

    private String nomeDisciplina;
    private String nomeProfessor;
    private double mediaAluno;
    private double av1;
    private double av2;

    // Construtor padrão
    public Disciplina() {
    }

    // Construtor com parâmetros
    public Disciplina(String nomeDisciplina, String nomeProfessor) {
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
    }

    // Getters e Setters
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public double getMediaAluno() {
        return mediaAluno;
    }

    // Implementação da interface
    @Override
    public String nome_disciplina() {
        return nomeDisciplina;
    }

    @Override
    public String nome_professor() {
        return nomeProfessor;
    }

    @Override
    public double media_aluno() {
        return mediaAluno;
    }

    public void calcularMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da AV1: ");
        this.av1 = sc.nextDouble();

        System.out.print("Digite a nota da AV2: ");
        this.av2 = sc.nextDouble();

        this.mediaAluno = (this.av1 + this.av2) / 2.0;

        mediaAluno = media_aluno();
    }
}
