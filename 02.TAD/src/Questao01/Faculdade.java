package Questao01;

import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disciplina d = new Disciplina();

        System.out.print("\n\nDigite o nome da disciplina: ");
        d.setNomeDisciplina(sc.nextLine());

        System.out.print("Digite o nome do professor: ");
        d.setNomeProfessor(sc.nextLine());

        d.calcularMedia();

        // Exibir as informações
        System.out.println("\nInformações da disciplina:");
        System.out.println("Disciplina: " + d.nome_disciplina());
        System.out.println("Professor: " + d.nome_professor());
        System.out.println("Média do aluno: " + d.media_aluno());

        sc.close();
    }
}