package questao05;

public class Banco {

	public static void main(String[] args) {
		OperacoesBancarias ob = new OperacoesBancarias();
		
		System.out.println("\tBANCO LANA");
		System.out.println("\nDEPOSITO:");
        ob.depositar();  
        
        System.out.println("\nSAQUE:");
        ob.sacar();      
        
        System.out.println("\nATUALIZAR SALDO:");
        ob.atualizar();  

        System.out.println("\nHISTORICO DE TRANSAÇÕES:");
        for (String transacao : ob.historicoTransacoes) {
            System.out.println(transacao);
        }

        System.out.println("\nSALDO:");
        ob.visualizarSaldo();

	}

}
