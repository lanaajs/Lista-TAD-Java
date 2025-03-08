package questao09;

public class Restaurante {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		
		System.out.println("RESTAURANTE DA LANA\n");
		pedido.dadosCliente();
		pedido.itens();
		pedido.qtdItens();
		pedido.valorCompra();

	}

}
