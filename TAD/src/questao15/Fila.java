package questao15;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Fila extends Paciente implements IFila, Comparable<Fila> { //definir a ordem natural dos objetos da classe

	Scanner sc = new Scanner(System.in);
	
    int prioridade; // 1 (alta), 2 (média), 3 (baixa)
    LocalTime horarioChegada;

    @Override
    public String nome() {
    	System.out.print("NOME DO PACIENTE: ");
    	nome = sc.nextLine();
        return nome;
    }

    @Override
    public int prioridade() {
    	System.out.print("GRAU DE PRIORIDADE:\r\n"
    			+ "- Alta (1)\r\n"
    			+ "- Média (2)\r\n"
    			+ "- Baixa (3)\r\n"
    			+ "\nDIGITE: ");
    	
    	prioridade = sc.nextInt();
    	sc.nextLine();
    	
        return prioridade;
    }

    @Override
    public LocalTime horarioChegada() {
        while (this.horarioChegada == null) { 
            System.out.print("HORÁRIO DE CHEGADA (HH:mm): ");
            String entrada = sc.next();
            
            try {
                this.horarioChegada = LocalTime.parse(entrada); 
            } catch (DateTimeParseException e) {
                System.out.println("Formato de hora inválido. Tente novamente!");
            }
        }
        
        return this.horarioChegada;  // Retornando a variável de instância
    }


    
    @Override
    public int compareTo(Fila outro) {
        if (this.prioridade != outro.prioridade) {
            return Integer.compare(this.prioridade, outro.prioridade);
        }
        return this.horarioChegada.compareTo(outro.horarioChegada);
    }

    @Override
    public String toString() {
        return "REGISTRO>" + "Nome do Paciente = " + nome + "/ Prioridade = " + prioridade + "/ Horário de Chegada = " + horarioChegada + '}';
    }

}
