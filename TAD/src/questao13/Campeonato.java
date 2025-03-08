package questao13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Campeonato implements ICampeonato {

    private String nome;
    private List<Time> times;
    
    private Scanner sc = new Scanner(System.in);

    public Campeonato(String nome) {
        this.nome = nome;
        this.times = new ArrayList<>();
    }

    @Override
    public void adicionarTime() {
        System.out.print("Digite o nome do time: ");
        String nomeTime = sc.nextLine();
        
        Time novoTime = new Time(nomeTime);
        this.times.add(novoTime);
    }

    @Override
    public void registrarResultado() {
        System.out.print("Digite o nome do primeiro time: ");
        String time1Nome = sc.nextLine();
        Time time1 = buscarTime(time1Nome);

        System.out.print("Digite o nome do segundo time: ");
        String time2Nome = sc.nextLine();
        Time time2 = buscarTime(time2Nome);

        System.out.print("Digite o número de gols do primeiro time: ");
        int golsTime1 = sc.nextInt();

        System.out.print("Digite o número de gols do segundo time: ");
        int golsTime2 = sc.nextInt();
        sc.nextLine();

        //somar os gols ao total de pontos do time
        time1.adicionarGols(golsTime1);
        time2.adicionarGols(golsTime2);
    }

    @Override
    public void exibirClassificacao() {
        System.out.println("Classificação do Campeonato " + nome + ": ");
        
        //ordenar os times pela soma total de gols
        times.sort((t1, t2) -> Integer.compare(t2.getGols(), t1.getGols()));
        
        for (Time time : times) {
            System.out.println(time);
        }
    }

    private Time buscarTime(String nome) {
        for (Time time : times) {
            if (time.getNome().equalsIgnoreCase(nome)) {
                return time;
            }
        }
        System.out.println("Time não encontrado");
        return null;
    }

    public String getNome() {
        return nome;
    }

    public List<Time> getTimes() {
        return times;
    }
}
