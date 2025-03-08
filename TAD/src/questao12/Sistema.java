package questao12;

public class Sistema {

	public static void main(String[] args) {
		HistoricoCompra historico = new HistoricoCompra();

		historico.adicionarCompra(); 
		historico.adicionarCompra(); 

		historico.exibirHistorico();

		System.out.println("\nTotal gasto: R$ " + historico.totalGasto());

	}

}
