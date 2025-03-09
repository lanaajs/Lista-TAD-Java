package questao15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\tHOSPITAL");
		System.out.print("\nQUANTIDADE DE PACIENTES NA FILA: ");
		int numeroDePacientes = sc.nextInt();
		sc.nextLine(); 

		List<Fila> qtdPacienteFila = new ArrayList<>();

		for (int i = 0; i < numeroDePacientes; i++) {
			System.out.println("\nPACIENTE " + (i + 1) + ":");
			
			Fila f = new Fila();
			
			f.nome(); 
			f.prioridade(); 
			f.horarioChegada(); 
			qtdPacienteFila.add(f);
		}

		Collections.sort(qtdPacienteFila); //ordenar a lista de pacientes com base na prioridade e no horário de chegada

		System.out.println("\n\nFILA DE PACIENTES (Grau de prioridade):");
		for (Fila paciente : qtdPacienteFila) {
			System.out.println(paciente);
		}

	}
}
