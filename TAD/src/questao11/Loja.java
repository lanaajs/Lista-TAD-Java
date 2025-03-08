package questao11;

public class Loja {

    public static void main(String[] args) {
        Estoque produto = new Estoque();
        
        System.out.println("CADASTRANDO PRODUTO: ");
        
        produto.nome();
        produto.codigo();
        produto.qtd();
        produto.precoUnitario();

        System.out.println("\nProduto cadastrado com sucesso.");
        System.out.println("\nRESUMO DO CADASTRO:");
        
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Código: " + produto.getCodigo());
        System.out.println("Quantidade: " + produto.getQtd());
        System.out.println("Preço Unitário: " + produto.getPrecoUnitario());
    }
}
